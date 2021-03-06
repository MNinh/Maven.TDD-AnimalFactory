package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testName() {
        String catName = "Puurfect";
        Date catBirthDate = new Date(2010 - 06 - 12);
        int catID = 2;
        Cat cat = new Cat(catName, catBirthDate, catID);

        cat.setName("Pawfect");

        String expected = "Pawfect";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String catName = "Puurfect";
        Date catBirthDate = new Date(2010-06-12);
        int catID = 2;
        Cat cat = new Cat(catName, catBirthDate, catID);

        String expected = "meow!";
        Assert.assertEquals(expected, cat.speak());
    }

    @Test
    public void setBirthdayTest(){
        String catName = "Puurfect";
        Date catBirthDate = new Date(2010-06-12);
        int catID = 2;
        Cat cat = new Cat(catName, catBirthDate, catID);

        Date expected = new Date();
        cat.setBirthDate(expected);
        Assert.assertEquals(expected, cat.getBirthDate());
    }

    @Test
    public void eatTest(){
        String catName = "Puurfect";
        Date catBirthDate = new Date(2010-06-12);
        int catID = 2;
        Cat cat = new Cat(catName, catBirthDate, catID);

        Integer expected = 1;

        cat.eat(new Food());
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    @Test
    public void idCheck() {
        String catName = "Puurfect";
        Date catBirthDate = new Date(2010-06-12);
        int catID = 2;
        Cat cat = new Cat(catName, catBirthDate, catID);
        int expected = 2;
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritance(){
        String catName = "Puurfect";
        Date catBirthDate = new Date(2010-06-12);
        int catID = 2;
        Cat cat = new Cat(catName, catBirthDate, catID);
        boolean expected = true;
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mammalInheritance(){
        String catName = "Puurfect";
        Date catBirthDate = new Date(2010-06-12);
        int catID = 2;
        Cat cat = new Cat(catName, catBirthDate, catID);

        boolean expected = true;
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected, actual);

    }

}
