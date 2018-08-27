package IteratorPattern02;

import java.util.Iterator;

public class MyString implements Iterable<Character>{

    private String str;

    public MyString(String str) {
        this.str = str;
    }


    @Override
    public Iterator<Character> iterator() {
        return new newIter(str);
    }
}
