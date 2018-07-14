package AbstractFactory;

// 抽象产品类
abstract class ContainerProduct extends AbstractProduct{
    @Override
    public abstract void Show();
}

//  模具产品抽象类
abstract class MouldProduct extends AbstractProduct{
    @Override
    public abstract void Show();
}
