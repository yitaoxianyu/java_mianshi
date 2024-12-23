package 设计模式;

//将具体实现延迟到子类当中,保证了开闭原则
//定义一个模板方法类,规定做事步骤,但是将具体实现交由子类去实现
//优点 : 保证了开闭原则,使得功能更加多样灵活
//缺点 : 每次都需要创建一个具体的实现类,增加了系统的复杂度
public class TemplateMethodPattern {
    Cooking cf = new CookingFood();
}

abstract class Cooking{
    protected abstract void method1();
    protected abstract void method2();
    public void template(){
        System.out.println("做饭开始,以下是具体步骤");
        method1();
        method2();
        System.out.println("做饭结束");
    }
}

class CookingFood extends Cooking{

    @Override
    protected void method1() {
        System.out.println("西红柿炒鸡蛋:放鸡蛋");
    }

    @Override
    protected void method2() {
        System.out.println("西红柿炒鸡蛋:放西红柿");
    }
}
