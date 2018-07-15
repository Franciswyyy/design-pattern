package Decorator01;

import Decorator01.decorator.Milk;
import Decorator01.decorator.Mocha;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Milk(new Mocha(new Milk(new HouseBlend())));
        System.out.println(beverage.cost());

    }
}
