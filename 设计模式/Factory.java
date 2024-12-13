package 设计模式;

public class Factory {

    //由于普通工厂模式具有缺陷,假如我想让他生产新的产品,需要对代码进行修改
    //这不符合程序设计的原则(拓展,而不修改)
    //所以产生了这个工厂设计模式,也就是说实现一个抽象工厂类,之后各个工厂都实现行为,将创建对象的过程延长到工厂方法中

    public static void main(String[] args) {
        productFactory factoryA = new FactoryA();
        productFactory factoryB = new FactoryB();

        product productA = factoryA.createProduct();
        product productB = factoryB.createProduct();

        productA.doWork();
        productB.doWork();
    }

    public interface product{
        void doWork();
    }

    public static class ProductA implements product{
        @Override
        public void doWork() {
            System.out.println("A产品工作");
        }
    }

    public static class ProductB implements product{
        @Override
        public void doWork() {
            System.out.println("B产品工作");
        }
    }

    public interface productFactory{
        product createProduct();
    }

    public static class FactoryA implements productFactory{

        @Override
        public product createProduct() {
            return new ProductA();
        }
    }

    public static class FactoryB implements productFactory{

        @Override
        public product createProduct() {
            return new ProductB();
        }
    }

}
