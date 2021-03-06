package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    String dogName = "Bud";
    Date dogBirthDate = new Date(2007-05-18);
    int dogID = 9;
    Dog dog1 = new Dog(dogName, dogBirthDate, dogID);
    Dog dog2 = new Dog(dogName, dogBirthDate, dogID);
    Dog dog3 = new Dog(dogName, dogBirthDate, dogID);
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }


    @Test
    public void testAddDog() {
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        int expected = 2;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1(){
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.remove(dog1.getId());
        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.remove(dog1);
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDogId(){
        DogHouse.clear();
        DogHouse.add(dog1);
        Dog expected = dog1;
        Dog actual = DogHouse.getDogById(dogID);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDogAmount(){
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        int expected = 3;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }
}
