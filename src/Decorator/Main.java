package Decorator;

public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay("hello world");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b1);
        Display b4 = new FullBorder(b2);
        Display b5 = new SideBorder(b4, '$');
        Display b6 = new FullBorder(b5);


        b1.show();
        System.out.println();
        b2.show();
        System.out.println();
        b3.show();
        System.out.println();
        b4.show();
        System.out.println();
        b5.show();
        System.out.println();
        b6.show();

    }
}
