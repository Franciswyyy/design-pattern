package AbstractFactory;

/**
 * 背景：两个塑料加工厂，A厂生产容器A和模具A， B厂生产容器B和模具B
 *
 *1.抽象工厂，生成两个抽象的容器和模具  Factory
 *2.抽象产品族，就一个抽象产品接口  AbstractProduct
 *3.抽象产品类，定义具体产品的接口， ChouXiangProduct，生成容器和模具
 *4.具体产品类  继承抽象产品类，如继承容器A，B继承容器抽象类
 *5.具体工厂类，用于生成哪个具体的产品
 *
 */


public class Main {

    public static void main(String[] args){
        FactoryA mFactoryA = new FactoryA();
        FactoryB mFactoryB = new FactoryB();
        //A厂当地客户需要容器产品A
        mFactoryA.ManufactureContainer().Show();
        //A厂当地客户需要模具产品A
        mFactoryA.ManufactureMould().Show();

        //B厂当地客户需要容器产品B
        mFactoryB.ManufactureContainer().Show();
        //B厂当地客户需要模具产品B
        mFactoryB.ManufactureMould().Show();

    }
}
