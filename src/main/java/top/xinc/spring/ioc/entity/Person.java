package top.xinc.spring.ioc.entity;

public class Person {
    String name;
    String clothes;

    public void dress(String name,String clothes){
        System.out.println(name+"爱穿"+clothes);
    }

    public Person() {
    }

    public Person(String name, String clothes) {
        this.name = name;
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
}
