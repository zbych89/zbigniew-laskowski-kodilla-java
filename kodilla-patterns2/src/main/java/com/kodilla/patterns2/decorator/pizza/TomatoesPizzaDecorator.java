package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoesPizzaDecorator extends AbstractPizzaOrderDecorator {
    public TomatoesPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and tomatoes";
    }
}
