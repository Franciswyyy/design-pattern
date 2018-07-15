package Prototype.framework;

/*
    该接口继承Cloneable接口的话。
    实现了该接口的类的实例可以调用clone方法来自动复制实例即可。
 */
public interface Product extends Cloneable{

    public abstract void use(String s);  // 使用这个字符修饰一点东西
    public abstract Product createClone();  // 创建这个修饰后的实例
}
