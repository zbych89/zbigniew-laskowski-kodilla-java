package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamPizzaDecorator extends AbstractPizzaOrderDecorator {
    public HamPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and ham";
    }
}
