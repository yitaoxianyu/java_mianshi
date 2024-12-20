import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //自定义排序需要在容器初始化是传入一个Comparator匿名函数类
        //并且元素实现Comparable接口

        //set集合底层都是根据map来实现的
        //set集合默认是根据equals进行去重的,但是equals比较的地址所以想要根据年龄进行比较的话需要重写equals方法
        //HashSet是底层是由HashMap进行实现的
        //LinkedSet底层是根据LinkedHashMap实现的可以保证FIFO的顺序
        //Tree支持实现自定义排序

        //ArrayDeque和LinkedList的区别
        //ArrayDeque底层实现是由数组和双指针,而LinkedList底层是使用双向链表实现
        //ArrayDeque均摊插入性能比LinkedList性能更高,但是时间复杂度都是O1
        //ArrayDeque不支持存储NULL数据
        HashSet<Person> hashSet = new HashSet<Person>(10);
        hashSet.add(new Person(10));
        hashSet.add(new Person(10));
        hashSet.add(new Person(20));
        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getAge());
        }
    }
}
