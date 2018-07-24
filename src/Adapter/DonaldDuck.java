package Adapter;

// 唐老鸭是鸭子的子类， 能叫，会飞
public class DonaldDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("i'am flying");
    }
}
