package TemplateMethod01;


/*
 冲咖啡和冲茶都类似，但是某些步骤不一样，要求复用相同步骤的代码
 第一步： 烧水，
 第二步：加咖啡，加茶
 第三步：倒入杯子中
 第四步：加牛奶，加柠檬

  */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("-----------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
