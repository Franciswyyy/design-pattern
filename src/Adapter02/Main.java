package Adapter02;

/*
    委托的方式
 */
public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }
}
