package io.zipcoder.polymorphism;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public int compare(Pet pet1, Pet pet2) {
        if (pet1.getClass().getName().equals(pet2.getClass().getName())) {
            return pet1.getName().compareTo(pet2.getName());
        } else {
            return pet1.getClass().getName().compareTo(pet2.getClass().getName());
        }
    }
}
