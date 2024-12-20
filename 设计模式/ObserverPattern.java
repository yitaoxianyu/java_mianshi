package 设计模式;

import java.nio.file.SecureDirectoryStream;
import java.util.ArrayList;


//观察者模式是类之间一对多的关系,也叫消息订阅模式
//每当一个对象状态发生改变时,其相关依赖对象都得到通知并被自动更新
public class ObserverPattern {

    public static void main(String[] args) {
        Debit zhangsan = new ZhangSan();
        zhangsan.borrow(new WangWu());
        zhangsan.borrow(new LiSi());

        zhangsan.notifyAllCredit();
    }

}
class WangWu implements Credit{

    @Override
    public void takeMoney() {
        System.out.println("王五要钱");
    }
}

class LiSi implements Credit {

    @Override
    public void takeMoney() {
        System.out.println("李四要钱");
    }
}

class ZhangSan implements Debit{

    ArrayList<Credit> arrayList = new ArrayList<>();
    @Override
    public void borrow(Credit credit) {
        arrayList.add(credit);
    }

    @Override
    public void notifyAllCredit() {
        arrayList.forEach(Credit::takeMoney);
    }
}

interface Debit{
    void borrow(Credit credit);


    void notifyAllCredit();
}

interface Credit{
    void takeMoney();
}
