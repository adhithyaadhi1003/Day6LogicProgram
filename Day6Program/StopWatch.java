package com.Day6Program;

import java.util.Date;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
		Date date =new Date();
		long StartTime= date.getTime();
		System.out.println(StartTime);
		
		Thread.sleep(2000);
		
		Date date1 =new Date();
		long EndTime= date1.getTime();
		System.out.println(EndTime);
		
		System.out.println("Elapse time is = " +(EndTime-StartTime));
		
	}
	
	

}
