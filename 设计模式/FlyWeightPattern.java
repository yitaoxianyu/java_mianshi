package 设计模式;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FlyWeightPattern {
    public static void main(String[] args) {
        FlyWeightFactory factory = FlyWeightFactory.getInstance();
        FlyWeightBike flyWeight = factory.getFlyWeight();
        System.out.println(flyWeight);
        flyWeight.use();
        System.out.println(factory.getFlyWeight());
    }
}

//定义一个享元模板
abstract class FlyWeight{
    protected long id;
    protected int state = 0;

    abstract void back();

    abstract void use();
}

class FlyWeightBike extends FlyWeight{
    private static final Random random = new Random();

    public FlyWeightBike(){
        int id = random.nextInt(100);
    }

    @Override
    void back() {
        this.state = 0;
    }

    @Override
    void use() {
        this.state = 1;
        System.out.println("骑车");
    }
}

class FlyWeightFactory{
    private FlyWeightFactory(){
        for (int i = 0; i < 2; i++) {
            pool.add(new FlyWeightBike());
        }
    }
    private Set<FlyWeight> pool = new HashSet<>();

    private static volatile FlyWeightFactory instance;

    public static FlyWeightFactory getInstance() {
        if(instance == null) {
            synchronized (FlyWeightFactory.class) {
                if (instance == null) {
                    instance = new FlyWeightFactory();
                }
                return instance;
            }
        }
        return instance;
    }

    public FlyWeightBike getFlyWeight() {
        for (FlyWeight flyWeight : pool) {
            if(flyWeight.state == 0){
                return (FlyWeightBike) flyWeight;
            }
        }
        return null;
    }

}