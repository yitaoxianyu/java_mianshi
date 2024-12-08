package 多线程;

public class Demo03 {
    public static void main(String[] args) throws InterruptedException {

        //wait是让一个持有锁的线程进行等待,所以wait只能在synchronized代码块中,当有的线程拿到这个对象锁之后则进行等待
        Object o = new Object();
        synchronized (o){
            o.wait();
        }

    }
}
