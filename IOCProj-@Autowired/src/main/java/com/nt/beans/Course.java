package com.nt.beans;

import java.util.Calendar;

import lombok.ToString;

@ToString
public class Course {
	
	private int cid;
	private String cname;
	private Calendar dom;
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setDom(Calendar dom) {
		this.dom = dom;
	}
	
	


}
