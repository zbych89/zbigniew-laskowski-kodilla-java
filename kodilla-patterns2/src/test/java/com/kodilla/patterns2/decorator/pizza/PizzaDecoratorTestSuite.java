package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaDecoratorTestSuite {
    @Test
    public void testPizzaWithCheeseAndSomething(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new TomatoesPizzaDecorator(theOrder);
        theOrder = new ExtraCheesePizzaDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(18.5),theCost);
        Assert.assertEquals("Pizza with cheese and sauce and tomatoes and extra cheese",description);
    }
    @Test
    public void testPizzaWithTwoIngredients(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamPizzaDecorator(theOrder);
        theOrder = new MushroomsPizzaDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(18),theCost.stripTrailingZeros());
        Assert.assertEquals("Pizza with cheese and sauce and ham and mushrooms",description);
    }
}
