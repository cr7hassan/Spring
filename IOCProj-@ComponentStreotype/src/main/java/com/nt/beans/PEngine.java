package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PEngine implements Engine {

		
		@Value("962962")
		private long engineid;
		@Override
		public void start() {
			System.out.println("PEngine.start() "+engineid);

		}

	/*
	 * @Override public void journey(String start,String end) {
	 * System.out.println("joURNEY STARTS FROM :: "+start+" and ENDS AT "+end); }
	 */
		@Override
		public void end() {

			System.out.println("PEngine.end() "+engineid);

		}


}
