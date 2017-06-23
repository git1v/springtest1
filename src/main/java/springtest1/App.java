package springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[]args){
		System.out.println("Hello, Spring");
		ApplicationContext app=new ClassPathXmlApplicationContext("bean-conf.xml");
		HelloBean bean=(HelloBean)app.getBean("hellobean");
		bean.hello();
	}
}
