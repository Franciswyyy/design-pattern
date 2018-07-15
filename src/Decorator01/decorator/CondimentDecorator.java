package Decorator01.decorator;


import Decorator01.Beverage;

// 原料，即也就是装饰的类
public abstract class CondimentDecorator implements Beverage {

    protected Beverage beverage;
}
