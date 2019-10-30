package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

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




}
