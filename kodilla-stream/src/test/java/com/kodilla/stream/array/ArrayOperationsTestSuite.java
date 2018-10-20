package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int[] theArray = new int[]{-1,1,-2,2,-3,3,-4,4,-5,5,-6,6,-7,7,-8,8,1,1,3,4};
        double result = ArrayOperations.getAverage(theArray);
        Assert.assertEquals(0.45,result,0);
    }
}
