package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Beginning the test case");
    }
    @After
    public void after(){
        System.out.println("Test case ended");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyOne = new ArrayList<Integer>();
        ArrayList<Integer> result1 = exterminator.exterminate(emptyOne);
        System.out.println("Testing the empty list");
        Assert.assertEquals(result1,emptyOne);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> someList = new ArrayList<Integer>(Arrays.asList(1,6,4,3,5,2,4));
        ArrayList<Integer> result2 = exterminator.exterminate(someList);
        System.out.println("Testing the non-empty list");
        Assert.assertEquals(result2,new ArrayList<Integer>(Arrays.asList(6,4,2,4)));
    }
}
