package IteratorPattern;


// 表示该方法只会生成一个用于遍历集合的迭代器
public interface Aggregate {
    public abstract Iterator iterator();
}
