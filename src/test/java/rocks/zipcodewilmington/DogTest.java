package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testName(){
        String dogName = "Bud";
        Date dogBirthDate = new Date(2007-05-18);
        int dogID = 9;
        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        dog.setName("Air");

        String expected = "Air";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String dogName = "Bud";
        Date dogBirthDate = new Date(2007-05-18);
        int dogID = 9;
        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        String expected = "bark!";
        Assert.assertEquals("bark!", dog.speak());
    }

    @Test
    public void setBirthDateTest(){
        String dogName = "Bud";
        Date dogBirthDate = new Date(2007-05-18);
        int dogID = 9;
        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        Date expected = new Date();
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        String dogName = "Bud";
        Date dogBirthDate = new Date(2007-05-18);
        int dogID = 9;
        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        Integer expected = 1;

        dog.eat(new Food());
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }

    @Test
    public void idCheck() {
        String dogName = "Bud";
        Date dogBirthDate = new Date(2007-05-18);
        int dogID = 9;
        Dog dog = new Dog(dogName, dogBirthDate, dogID);
        int expected = 9;
        int actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritance(){
        String dogName = "Bud";
        Date dogBirthDate = new Date(2007-05-18);
        int dogID = 9;
        Dog dog = new Dog(dogName, dogBirthDate, dogID);
        boolean expected = true;
        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mammalInheritance(){
        String dogName = "Bud";
        Date dogBirthDate = new Date(2007-05-18);
        int dogID = 9;
        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        boolean expected = true;
        boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected, actual);

    }
}
