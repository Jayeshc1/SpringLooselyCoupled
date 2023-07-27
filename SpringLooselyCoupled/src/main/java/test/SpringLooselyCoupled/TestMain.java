package test.SpringLooselyCoupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Helper helper = (Helper) context.getBean("helper");
		helper.getBikes();
		

		/*//Tightly Coupled
		HeroBikes hb = new HeroBikes();
		hb.testDrive();
		
		//Loosely Coupled
		Bikes bike1 = new HeroBikes();
		bike1.testDrive();
		
		Bikes bike2 = new HondaBikes();
		bike2.testDrive();*/
	}
}
