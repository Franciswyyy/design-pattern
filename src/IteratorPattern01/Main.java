package IteratorPattern01;

// 自定义类的迭代，如跳跃取字符串字符
public class Main {

    public static void main(String[] args) {
        MyString str = new MyString("123456789");

        for(char c : str){
            System.out.print(c);
        }
    }
}
