package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    private Cat cat;

    @Before
    public void setUp(){
        cat = new Cat("Winston");
    }


    @Test
    public void getNameTest(){
        String expected = "Winston";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        cat.setName("Snowball");
        String actual = cat.getName();
        String expected = "Snowball";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String expected = "meh";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outputPetTest(){
        cat.setName("Winston");
        String actual = cat.outputPet();
        String expected = "Pet: Winston   Type: Cat  Says: meh";
        Assert.assertEquals(expected, actual);
    }

}
