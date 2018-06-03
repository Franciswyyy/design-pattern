package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('W');
        AbstractDisplay d2 = new StringDisplay("Dream Of Success");
        d1.display();
        d2.display();
    }
}
