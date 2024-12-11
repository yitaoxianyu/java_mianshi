package 设计模式;

public class SimpleFactory {

    public static void main(String[] args) {
        Product a = SimpleFactory.createProduct("A");
        System.out.println(a);
    }

    public static Product createProduct(String type){
        if(type.equals("A")) return new ProductA();
        else return new ProductB();
    }

    public static class ProductA extends Product{

    }

    public static class ProductB extends Product{

    }

    public abstract static class Product{

    }
}

