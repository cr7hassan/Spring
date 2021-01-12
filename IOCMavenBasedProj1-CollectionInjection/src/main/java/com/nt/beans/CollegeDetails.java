package com.nt.beans;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class CollegeDetails {
	private List<String> snames;
	private Date[] impDates;
}
