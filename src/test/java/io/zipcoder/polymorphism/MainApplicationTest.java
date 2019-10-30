package io.zipcoder.polymorphism;

import org.junit.Test;
import org.junit.Assert;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    @Test
    public void speakTest(){
        Cat cat = new Cat("Winston");
        Dog dog = new Dog("Fido");
        Fish fish = new Fish("Fishy");
        Pet[] petsExpected = new Pet[]{cat, dog, fish};

        String catExpected = "meh";
        String catActual = petsExpected[0].speak();

        String dogExpected = "bark";
        String dogActual = petsExpected[1].speak();

        String fishExpected = "bubble";
        String fishActual = petsExpected[2].speak();

        Assert.assertEquals(catExpected, catActual);
        Assert.assertEquals(dogExpected, dogActual);
        Assert.assertEquals(fishExpected, fishActual);
    }

    @Test
    public void getNameTest(){
        Cat cat = new Cat("Winston");
        Dog dog = new Dog("Fido");
        Fish fish = new Fish("Fishy");
        Pet[] petsExpected = new Pet[]{cat, dog, fish};

        String catExpected = "Winston";
        String catActual = petsExpected[0].getName();

        String dogExpected = "Fido";
        String dogActual = petsExpected[1].getName();

        String fishExpected = "Fishy";
        String fishActual = petsExpected[2].getName();

        Assert.assertEquals(catExpected, catActual);
        Assert.assertEquals(dogExpected, dogActual);
        Assert.assertEquals(fishExpected, fishActual);
    }

    


}
