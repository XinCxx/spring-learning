package top.xinc.spring.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xinc.spring.ioc.entity.Clothes;
import top.xinc.spring.ioc.entity.Person;


public class PersonTest {
    public static void main(String[] args) {
        String xmlPath="/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        Clothes c1 = (Clothes) ac.getBean("skirt");
        Person girl = new Person();
        girl.dress("女孩",c1.getColor()+c1.getStyle());
        Clothes c2 = (Clothes) ac.getBean("xizhuang");
        Person boy = new Person();
        boy.dress("男孩",c2.getColor()+c2.getStyle());
    }
}

