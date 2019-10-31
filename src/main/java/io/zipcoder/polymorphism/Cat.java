package io.zipcoder.polymorphism;

import java.util.Comparator;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meh";
    }


}
