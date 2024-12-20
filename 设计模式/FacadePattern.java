package 设计模式;

//设想这样一个场景,当今如果需要证明一个人的身份需要各种材料
//而开具这些材料需要在各个部门开,为了简化流程,于是我们可以将这些流程进行封装及一次就可以
//这就是外观模式,用户不用在意底层的实现机制,只会在意其功能但是这种设计模式违反了开闭原则
public class FacadePattern {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.prove();
    }

}

class SubFlow1{
    public boolean isAlive(){
        return true;
    }
}

class SubFlow2{
    public boolean isOk(){
        return true;
    }
}

class SubFlow3{
    public boolean isGoodMan(){
        return true;
    }
}

class Facade{
    SubFlow1 subFlow1 = new SubFlow1();
    SubFlow2 subFlow2 = new SubFlow2();
    SubFlow3 subFlow3 = new SubFlow3();

    boolean prove(){
        return subFlow1.isAlive() && subFlow2.isOk() && subFlow3.isGoodMan();
    }
}