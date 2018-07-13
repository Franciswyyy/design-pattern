package FactoryMethod;

// 使用的是模板方法定义生成产品，注册产品。而具体的实现交给了子类
public abstract class Factory {
    //final为了不重写，包装好了
    public final Product create(String own){
        Product p = createProduct(own);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String own);
    protected abstract void registerProduct(Product product);
}
