import interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
//  Mentor mentor = (Mentor)container.getBean("partTimeMentor");//bean id from the config.xml
        Mentor mentor = container.getBean("fullTimeMentor",Mentor.class);
        mentor.createAccount();



    }

}
