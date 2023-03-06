package top.xinc.spring.ioc.entity;


public class Dog {
    String name;
    int age;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}