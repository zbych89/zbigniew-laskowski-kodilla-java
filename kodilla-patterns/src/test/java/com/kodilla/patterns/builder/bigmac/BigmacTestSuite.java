package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmanBuilder(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sesame()
                .burgers(2)
                .sauce("standard")
                .add("CHEESE")
                .add("ONION")
                .build();
        Assert.assertTrue(bigmac.isBun());
        Assert.assertEquals(2,bigmac.getBurgers());
        Assert.assertEquals("standard",bigmac.getSauce());
        Assert.assertEquals(2,bigmac.getIngredients().size());
    }
}
