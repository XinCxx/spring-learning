package top.xinc.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    public static void main(String[] args) {
        String xmlPath = "/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.say();

    }
}
