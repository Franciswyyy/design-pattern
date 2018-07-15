package TemplateMethod01;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }

    @Override
    void boilWater() {
        super.boilWater();
    }

    @Override
    void pourInCup() {
        super.pourInCup();
    }
}
