package Decorator02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    /*
    OK THAT WHAT I SAT, FINISH MAIN JAVA IS PERFECT
     */
    public static void main(String[] args) {
        try {
            InputStream in = new LowerCaseInputStream(
                                new BufferedInputStream(
                                     new FileInputStream("F:\\design-pattern\\src\\Decorator02\\InputTest.java")));
            int c ;
            while((c = in.read()) > 0){
                System.out.print((char)c);
            }

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
