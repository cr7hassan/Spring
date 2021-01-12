package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Student{
	
	private int sid;
	private String sname;
	@Autowired
	private Course course;
	@Autowired
	private Date doj;
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return "SID: "+sid+" SNAME: "+sname+" Course: "+course+" DOJ:: "+doj;
	}
	
	
}