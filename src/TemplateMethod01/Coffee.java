package TemplateMethod01;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }

}
