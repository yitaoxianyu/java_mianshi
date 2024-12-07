package 多线程;

import java.util.concurrent.TimeUnit;

public class Thread02 implements Runnable{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("过了两秒钟我结束了");
    }
}
