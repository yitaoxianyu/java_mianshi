package 多线程;


import java.util.concurrent.TimeUnit;

public class Thread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("我是自己创建的线程" + i);
        }
    }
}
