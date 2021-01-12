package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.CollegeDetails;
import com.nt.beans.StudentDetails;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		StudentDetails sd=factory.getBean("st",StudentDetails.class);
		System.out.println(sd);
		CollegeDetails cd=factory.getBean("clg", CollegeDetails.class);
		System.out.println(cd);
	}
}
