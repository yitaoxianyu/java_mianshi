package duoxiancheng;

import java.util.concurrent.TimeUnit;

public class Demo01 {
    //创建线程的三种方法:
    //1:继承thread类实现run方法
    //2:实现runnable接口的run方法,放到thread调用start方法
    //3:如果想要线程结束后可以返回值,可以实现callable接口,同理调用start方法
    public static void main(String[] args) throws InterruptedException {
        /* Thread01 thread01 = new Thread01();
        thread01.start();*/
        /* Thread thread = new Thread(new Thread02());
        thread.start();*/
        /* Thread03 thread03 = new Thread03();
        FutureTask<Integer> futureTask = new FutureTask<>(thread03);
        Thread Thread = new Thread(futureTask);
        thread.start();
        futureTask.get() 这里其实并不是和下面的for循环形成多线程,这里会堵塞线程等待返回值*/
        for (int i = 0; i < 100; i++) {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("我是主线程" + i);
        }
    }
}
