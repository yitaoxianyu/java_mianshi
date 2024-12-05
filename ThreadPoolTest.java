import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
    private static final ExecutorService executors = Executors.newFixedThreadPool(20);
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        for(int i = 1;i <= 20; i ++){
            Future<?> submit = executors.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                        System.out.println("hello");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        submit.get(); //这里由于获取线程执行的结果，会等待一个线程执行完获取完之后再开启另一个线程
        }
    }
}
