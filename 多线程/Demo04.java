package 多线程;

public class Demo04 {
    static int counter = 0; // 共享变量

    public static void main(String[] args) throws InterruptedException {
        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter++; // 修改共享变量
                try {
                    Thread.sleep(100); // 模拟工作
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread readerThread = new Thread(() -> {
            // 等待一段时间
            try {
                Thread.sleep(300); // 确保 writerThread 有机会执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 输出 counter 的值
            System.out.println("Counter: " + counter);
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();
    }
}

