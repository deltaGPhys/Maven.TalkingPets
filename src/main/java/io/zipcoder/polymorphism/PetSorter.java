package io.zipcoder.polymorphism;

import java.util.Arrays;
import java.util.Comparator;

public class PetSorter {

    private Pet[] pets;

    public PetSorter(Pet[] pets) {
        this.pets = pets;
    }

    public Pet[] sort(Comparator<Pet> comparator) {
        Arrays.sort(this.pets, comparator);
        return this.pets;
    }
}
