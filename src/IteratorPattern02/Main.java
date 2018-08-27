package IteratorPattern02;

// 重写上述的简单代码
public class Main {

    public static void main(String[] args) {
        MyString str = new MyString("123456789");

        for(char c : str){
            System.out.print(c);
        }
    }
}
