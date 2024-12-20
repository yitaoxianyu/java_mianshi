import java.util.Objects;

public class Person implements Comparable<Person>{
    private int age;

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age > o.getAge()) return 1;
        if(this.age < o.getAge()) return - 1;
        return 0;
    }

    public Person(int age){
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }
}
