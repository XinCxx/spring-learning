package top.xinc.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xinc.spring.ioc.entity.Cat;
import top.xinc.spring.ioc.entity.Dog;


public class AnimalTest {
    public static void main(String[] args) {
        String xmlPath = "/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        Dog dog = (Dog) ac.getBean("dog");
        Cat cat = (Cat) ac.getBean("cat");
        dog.getAge();
        dog.getName();
        System.out.println(dog.toString());
        cat.getName();
        cat.getName();
        System.out.println(cat.toString());
    }
}