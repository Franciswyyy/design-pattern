package Adapter;

// 缺鸭子对象，需要用火鸡来冒充，但是接口不同，所以不能公开拿来用
public class TurkeyAdapter implements Duck{    // 目标接口

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 这样鸭子飞一起，火鸡要飞5次
        for(int i = 0; i < 5; i ++){
            turkey.fly();
        }
    }
}
