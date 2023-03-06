package top.xinc.spring.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xinc.spring.ioc.entity.Book;

public class BookTest {
    public static void main(String[] args) {
        String xmlPath = "/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        Book book1 = (Book)ac.getBean("book1");
        System.out.println("book对象通过带参构造方法创建："+book1.toString());
        Book book2 = (Book)ac.getBean("book2");;
        book2.setId("283920839012");
        book2.setName("xinc");
        book2.setPrice(88.88);
        System.out.println("book对象通过默认构造方法创建："+book2.toString());
    }
}

