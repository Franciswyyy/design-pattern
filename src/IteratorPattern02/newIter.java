package IteratorPattern02;

import java.util.Iterator;

public class newIter implements Iterator{

    private int length;
    private String str;
    private int cur = 0;

    public newIter(String string){
        this.str = string;
        this.length = string.length();
    }

    @Override
    public boolean hasNext() {
        return cur < length ? true : false;
    }

    @Override
    public Object next() {
        Character c = str.charAt(cur);
        cur += 2;
        return c;
    }

}
