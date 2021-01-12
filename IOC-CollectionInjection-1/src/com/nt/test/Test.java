package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Student;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory=null;
		Resource res=null;
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("st");
		Student s=(Student)obj;
		for(int a:s.getMarks()) {
			System.out.println(a+" ");
		}
		System.out.println(s);
	}
}
