package 设计模式;

public class ChainRespPattern {
    public static void main(String[] args) {

    }
}

//这里是责任链模式,当用户进行操作时,不必在意去调用谁,交由责任链去一级一级调用
//优点 : 将请求和处理进行分离,提高系统的灵活性只需在链中加一个处理器即可 缺点 : 降低系统性能
abstract class Handler{
    //这里保证其子类也可以进行访问需要protected进行修饰
    protected Handler nextHandler;
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    public abstract void process(Integer info);
}

class Leader extends Handler{

    @Override
    public void process(Integer info) {
        if(info >= 1 && info <= 10) System.out.println("进行处理");
        nextHandler.process(info);
    }
}

class Boss extends Handler{

    @Override
    public void process(Integer info) {
        if(info > 10 && info <= 100) System.out.println("进行处理");
        nextHandler.process(info);
    }
}
