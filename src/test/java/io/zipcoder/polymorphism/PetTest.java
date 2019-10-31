package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

/**
 * Created by leon on 11/6/17.
 */
public class PetTest {

    private Pet pet;

    @Before
    public void setUp(){
        pet = new Pet("Winston");
    }

    @Test
    public void speakTest(){
        String expected = "<Insert generic animal noise>";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        String expected = "Winston";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        pet.setName("Snowball");
        String actual = pet.getName();
        String expected = "Snowball";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outputPetTest(){
        pet.setName("Winston");
        String actual = pet.outputPet();
        String expected = "Pet: Winston   Type: Pet  Says: <Insert generic animal noise>";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparableTest() {
        Cat cat = new Cat("Venus");
        Dog dog = new Dog("Steve");
        Fish fish = new Fish("Julie");

        Pet[] pets = new Pet[] {pet, cat, dog, fish};
        Pet[] expected = new Pet[] {fish, dog, cat, pet};
        Arrays.sort(pets);

        Assert.assertEquals(expected, pets);
    }

    @Test
    public void comparableTest2() {
        Cat cat = new Cat("Winston");
        Dog dog = new Dog("Winston");
        Fish fish = new Fish("Winston");
        Pet pet2 = new Pet("Abe");

        Pet[] pets = new Pet[] {pet, pet2, cat, dog, fish};
        Pet[] expected = new Pet[] {pet2, cat, dog, fish, pet};
        Arrays.sort(pets);

        Assert.assertEquals(expected, pets);
    }

    @Test
    public void comparableTest3() {
        Cat cat = new Cat("Winston");
        Dog dog = new Dog("Winston");
        Fish fish = new Fish("Winston");
        Pet pet2 = new Pet("Abe");

        Pet[] pets = new Pet[] {pet, pet2, cat, dog, fish};
        Pet[] expected = new Pet[] {pet2, cat, dog, fish, pet};
        List<Pet> AL = new ArrayList<Pet>(Arrays.asList(pets));
        Collections.sort(AL);

        Assert.assertEquals(expected, AL.toArray());
    }

    @Test
    public void comparatorTest() {
        Cat cat = new Cat("Venus");
        Dog dog = new Dog("Steve");
        Fish fish = new Fish("Julie");
        Pet pet2 = new Pet ("Abe");

        Pet[] pets = new Pet[] {pet, cat, dog, fish, pet2};
        Pet[] expected = new Pet[] {cat, dog, fish, pet2, pet};

        PetSorter petSorter = new PetSorter(pets);
        Comparator<Pet> comparator = (Comparator<Pet>) new PetComparator();

        // when
        Pet[] actual = petSorter.sort(comparator);

        Assert.assertEquals(expected, pets);
    }

}
