package TemplateMethod;

/**
 * 1个实现方法，3个抽象方法
 */
public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    // 加final是为了不想重写这个方法
    public final void display(){
        open();
        for(int i = 0; i < 5; i ++){
            print();
        }
        close();
    }
}
