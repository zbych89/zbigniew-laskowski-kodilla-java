package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        Country poland = new Country(new BigDecimal("40000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country china = new Country(new BigDecimal("1200000000"));
        Country india = new Country(new BigDecimal("800000000"));
        Country usa = new Country(new BigDecimal("300000000"));
        Country canada = new Country(new BigDecimal("200000000"));
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent america = new Continent();
        World theWorld = new World();

        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(china);
        asia.addCountry(india);
        america.addCountry(usa);
        america.addCountry(canada);
        theWorld.addContinent(europe);
        theWorld.addContinent(asia);
        theWorld.addContinent(america);

        BigDecimal calculated = theWorld.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("2620000000");

        Assert.assertEquals(expected,calculated);
    }
}
