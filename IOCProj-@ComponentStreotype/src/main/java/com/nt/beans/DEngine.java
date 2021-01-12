package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DEngine implements Engine {

	
	@Value("12571257")
	private long engineid;
	
	@Override
	public void start() {
		System.out.println("DEngine.start()"+engineid);

	}
	/*
	 * @Override public void journey(String start,String end) {
	 * System.out.println("joURNEY STARTS FROM :: "+start+" and ENDS AT "+end); }
	 */

	@Override
	public void end() {

		System.out.println("DEngine.end()");

	}

}
