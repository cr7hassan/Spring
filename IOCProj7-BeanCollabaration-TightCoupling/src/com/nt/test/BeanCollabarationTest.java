package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Flipkart;

public class BeanCollabarationTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Flipkart fpkt=null;
		//hold spring bean cfg file
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create BeanFactory IOC container
		factory=new XmlBeanFactory(res);
		//get Target Bean class object
		fpkt=factory.getBean("fpkt",Flipkart.class);
		//invoke methods
		System.out.println(fpkt.shopping(new String[] {"colors","sweets","Bhang","colorGun"},
				                         new float[] {100.0f,1000.0f,500.0f,2000.0f}));

	}//main
}//class
