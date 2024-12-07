package 多线程;

public class Synchronized {
    public synchronized void talk(){
        for (int i = 0; i < 10; i++) {
            System.out.println("说");
        }
    }

    public synchronized void eat(){
        for (int i = 0; i < 10; i++) {
            System.out.println("吃");
        }
    }

    public synchronized void drink(){
        for (int i = 0; i < 10; i++) {
            System.out.println("喝");
        }
    }
}
