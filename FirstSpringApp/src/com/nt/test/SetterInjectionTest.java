package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessegeGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		//locate spring beans cfgs file
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessegeGenerator generator=null;
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC container(BeanFactoryContainer)
		factory=new XmlBeanFactory(res);
		//get Bean
		obj=factory.getBean("wish");
		//typecast
		generator=(WishMessegeGenerator)obj;
		//invoke business method
		System.out.println("messege::"+generator.generateWishMessege("raja"));
		
		
	}
}
