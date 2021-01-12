package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        Student st=ctx.getBean("stud",Student.class);
        System.out.println(st);
    }
}
