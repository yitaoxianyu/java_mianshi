package 设计模式;


public class Singleton {
    //volatile保证了线程变量的可见性
    private static volatile Singleton singleton;
    private Singleton(){};

    //懒汉式的两种方法
    /*
    public static synchronized Singleton getInstance(){
        if(singleton == null) singleton = new Singleton();
        return singleton;
    }
    */
    //此方法缺点为,多个线程调用时只能进行等待,所以可以缩小同步的范围,即在创建对象的时候进行同步即可


    /*
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
    */
    //这种方法缩小了同步的范围,提高了性能,只有在singleton为空时才会进行同步创建
}
