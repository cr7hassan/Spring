package com.nt.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main() start");
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null,obj1=null;
		WishMessageGenerator generator=null;
		//Hold spring bean cfg file
		//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//Create BeanFactory IOC container
		factory=new XmlBeanFactory(res);
		System.out.println("IOC container created");
		/*//get TargetBean class object 
		obj=factory.getBean("wmg");
		System.out.println("Target object is gathered");
		//type casting
		generator=(WishMessageGenerator)obj;*/
		//generator=factory.getBean("wmg",WishMessageGenerator.class);
		  generator=factory.getBean(WishMessageGenerator.class);
		
		//invoke method
		System.out.println("Result::"+generator.generateWishMessage("raja")); 
		System.out.println("SetterInjectionTest.main()-End");
	}//main
}//class
