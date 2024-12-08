package 多线程;

import java.util.concurrent.atomic.AtomicReference;

public class Demo02 {

//    private static int a = 0;
    private static void talk(){
        System.out.println("说");
    }

    private static void eat(){
        System.out.println("吃");
    }

    private static void drink(){
        System.out.println("喝");
    }

    public static void main(String[] args) throws InterruptedException {

        //CountDownLatch countDownLatch = new CountDownLatch(5000);

        //main方法为静态方法,静态方法只能访问属于该类的变量也就是static修饰的
        //该操作为创建500个线程对a进行自增,可能会导致线程安全
        /*  Runnable runnable = () -> {
            a ++;
            countDownLatch.countDown();
        };
        for (int i = 0; i < 5000; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        countDownLatch.await();*/
        //这里a不为5000一共有两个原因
        /*
        原因一 : main线程在循环创建线程时,创建耗时短,开启的多个线程还没哟来的及加就被输出了
        解决办法 : 使用countDownLatch,设置锁,让每个线程执行完之后再解锁,可以保证所有线程都执行了,但是并不能保证线程安全

        原因二 : 可能其中一个线程创建之后获取值之后在进行自增的过程中,另一个线程也获取到了相同的值,也就是并行执行了
        解决办法 : 使用锁防止线程并行执行

        或者可以使用java提供的原子整形类他会自动的保证线程的安全
        * */

        //System.out.println(a);

        //synchronized的使用方法
        //1.synchronized作用在代码块上
        /*Object lock = new Object();

        Runnable runnable1 = () -> {
            synchronized (lock){
                eat();
            }
        };

        Runnable runnable2 = () -> {
            synchronized (lock){
                drink();
            }
        };

        Runnable runnable3 = () -> {
            synchronized (lock){
                talk();
            }
        };

        Thread thread01 = new Thread(runnable1);
        Thread thread02 = new Thread(runnable2);
        Thread thread03 = new Thread(runnable3);

        thread01.start();
        thread02.start();
        thread03.start();
        */

        //这个可以让各个线程不能同时调用这个对象的方法,以这个对象加锁
        //Synchronized sy = new Synchronized();
        //假如我在这里创建一个新的对象实例,此时runnable1和2不会进行锁的争抢,锁的作用也就失效了
        //编译器会将没有作用的锁进行消除
        /*Synchronized sy2 = new Synchronized();
        Runnable runnable1 = sy2::eat;

        Runnable runnable2 = sy::drink;

        Runnable runnable3 = sy::talk;

        Thread thread01 = new Thread(runnable1);
        Thread thread02 = new Thread(runnable2);
        Thread thread03 = new Thread(runnable3);

        thread01.start();
        thread02.start();
        thread03.start();
        */

//        AtomicReference<Integer> atomicReference = new AtomicReference<>(10);
//        atomicReference.compareAndSet(10,20);
//        System.out.println(atomicReference.get());

        Object o = new Object();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                synchronized (o){

                }
            }
        };
    }
}

