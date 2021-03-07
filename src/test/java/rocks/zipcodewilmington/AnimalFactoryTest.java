package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Date dogBirthDate = new Date();

        Dog ralph = AnimalFactory.createDog("Ralph", dogBirthDate);

        String expectedDogName = "Ralph";
        String actualDogName = ralph.getName();
        Date expectedBirthDate = dogBirthDate;
        Date actualBirthDate = ralph.getBirthDate();


        Assert.assertEquals(expectedDogName, actualDogName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);

    }

    @Test
    public void createCatTest(){
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Date catBirthDate = new Date();

        Cat whiskers = AnimalFactory.createCat("Whiskers", catBirthDate);

        String expectedCatName = "Whiskers";
        String actualCatName = whiskers.getName();
        Date expectedBirthDate = catBirthDate;
        Date actualBirthDate = whiskers.getBirthDate();

        Assert.assertEquals(expectedCatName, actualCatName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

}