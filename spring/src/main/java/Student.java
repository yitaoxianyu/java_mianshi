public class Student {

    private String name;

    private Integer age;

    public Student() {
        System.out.println("我是构造方法");
    }

    public void init(){
        System.out.println("我是初始化方法");
    }

    public void destroy(){
        System.out.println("我被销毁了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
