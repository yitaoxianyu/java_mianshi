package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Thread03 implements Callable<Integer> {

    //这个可以携带返回值
    @Override
    public Integer call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("过了两秒我结束了");
        return 100;
    }
}
