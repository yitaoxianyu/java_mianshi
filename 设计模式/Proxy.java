package 设计模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Proxy {
    public static void main(String[] args) {
        Student student = new Student();
        student.doWork();

        PersonProxy personProxy = new PersonProxy(new Student());
        personProxy.doWork();

        DynamicProxy dynamicProxy = new DynamicProxy();
        ArrayList<Long> array = new ArrayList<>();
        Object proxyArray = dynamicProxy.getInstance(array);
    }

    //静态代理,需要自己编写代理类并且实现和需要代理的类一样的接口(缺点)
    //在构造方法中传入一个接口的实现类(即需要被代理的对象)
    private interface Person{
        void doWork();
    }

    private static class Student implements Person{
        @Override
        public void doWork() {
            System.out.println("工作");
        }
    }

    private static class PersonProxy implements Person{

        private final Person person;
        public PersonProxy(Person person){
            this.person = person;
        }

        @Override
        public void doWork() {
            System.out.println("before");
            person.doWork();
            System.out.println("after");
        }
    }

    //jdk中的动态代理需要有一个类来实现InvocationHandler
    //在创建动态代理对象时传入实现InvocationHandler的对象即可
    public static class DynamicProxy implements InvocationHandler{

        private Object targetProxy;

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("1");
            //这里invoke为返回值
            Object invoke = method.invoke(targetProxy, args);
            System.out.println("2");
            return invoke;
        }

        public Object getInstance(Object targetProxy){
            this.targetProxy = targetProxy;
            return java.lang.reflect.Proxy.newProxyInstance(targetProxy.getClass().getClassLoader(),targetProxy.getClass().getInterfaces(),this);
        }
    }
}
