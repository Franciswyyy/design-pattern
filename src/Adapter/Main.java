package Adapter;

public class Main {

    public static void main(String[] args) {

        Duck duck = new DonaldDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("测试火鸡：");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n\r" + "测试鸭子："+ "\n\r");
        testDuck(duck);

        System.out.println("\n\r" + "测试伪装的鸭子："+ "\n\r");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
