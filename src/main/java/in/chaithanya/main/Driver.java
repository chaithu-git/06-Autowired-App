package in.chaithanya.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.chaithanya.beans.Car;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Beans.xml");
    
    Car car=context.getBean("car",Car.class);
    
	}

}
