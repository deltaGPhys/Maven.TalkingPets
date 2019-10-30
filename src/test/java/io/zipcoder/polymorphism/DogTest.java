package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    private Dog dog;

    @Before
    public void setUp(){
        dog = new Dog("Winston");
    }


    @Test
    public void getNameTest(){
        String expected = "Winston";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        dog.setName("Snowball");
        String actual = dog.getName();
        String expected = "Snowball";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String expected = "bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outputPetTest(){
        dog.setName("Spot");
        String actual = dog.outputPet();
        String expected = "Pet: Spot   Type: Dog  Says: bark";
        Assert.assertEquals(expected, actual);
    }

}