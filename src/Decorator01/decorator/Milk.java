package Decorator01.decorator;

import Decorator01.Beverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
