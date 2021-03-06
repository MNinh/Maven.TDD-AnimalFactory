package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    String catName = "Puurfect";
    Date catBirthDate = new Date(2010-06-12);
    int catID = 2;
    Cat cat1 = new Cat(catName, catBirthDate, catID);
    Cat cat2 = new Cat(catName, catBirthDate, catID);

    @Test
    public void testAddCat() {
        CatHouse.clear();
        CatHouse.add(cat1);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1(){
        CatHouse.clear();
        CatHouse.add(cat1);
        CatHouse.remove(cat1.getId());
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        CatHouse.clear();
        CatHouse.add(cat1);
        CatHouse.remove(cat1);
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCatId(){
        CatHouse.clear();
        CatHouse.add(cat1);
        Cat expected = cat1;
        Cat actual = CatHouse.getCatById(catID);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfCats(){
        CatHouse.clear();
        CatHouse.add(cat1);
        CatHouse.add(cat2);

        int expected = 2;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
}
