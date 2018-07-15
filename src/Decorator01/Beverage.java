package Decorator01;


// 星巴克的任何饮料都要继承这个类
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
