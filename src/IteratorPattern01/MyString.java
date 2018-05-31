package IteratorPattern01;

import java.util.Iterator;

public class MyString implements Iterable<Character>{

    private int length;
    private String str;

    public MyString(String str) {
        this.str = str;
        this.length = str.length();
    }

    @Override
    public Iterator<Character> iterator() {

        class iter implements Iterator<Character>{

            private int cur = 0;

            @Override
            public boolean hasNext() {
                return cur < length ? true : false;
            }

            @Override
            public Character next() {
                Character c = str.charAt(cur);
                cur += 2;
                return c;
            }

        }
        return new iter();   //实现Iterabler的接口，返回迭代器
    }

}
