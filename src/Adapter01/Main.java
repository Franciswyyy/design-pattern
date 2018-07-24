package Adapter01;

/*
    在使用时，只知道用的是print接口，调用的是其weak，strong方法。
    并不知道show Paren，Aster方法都隐藏起来了
 */
public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }
}
