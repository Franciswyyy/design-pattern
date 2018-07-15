package Prototype.framework;

import java.util.HashMap;

// manage并没有与具体的类名，而是仅仅用了Product接口名，这个是桥梁
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto){
        showcase.put(name, proto);
    }

    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        System.out.println("原始对象的地址：" + p);
        System.out.println("复制对象的地址：" + p.createClone());
        System.out.println("原始对象的地址1：" + p);
        System.out.println("复制对象的地址1：" + p.createClone());
        return p.createClone();  // 创建一个复制的对象
    }
}
