package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FishTest {

    private Fish fish;

    @Before
    public void setUp(){
        fish = new Fish("Cosmo");
    }


    @Test
    public void getNameTest(){
        String expected = "Cosmo";
        String actual = fish.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        fish.setName("Wanda");
        String actual = fish.getName();
        String expected = "Wanda";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String expected = "bubble";
        String actual = fish.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outputPetTest(){
        fish.setName("Cosmo");
        String actual = fish.outputPet();
        String expected = "Pet: Cosmo   Type: Fish  Says: bubble";
        Assert.assertEquals(expected, actual);
    }

}