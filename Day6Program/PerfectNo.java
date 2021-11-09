package com.Day6Program;
import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number to check perfect or not n= ");
		int n=obj.nextInt();
		for(i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
				System.out.println("  " +sum);
			}
		}
		if(n==sum) {
			System.out.println("entered number is perfect number");
		}else {
			System.out.println("entered number is not perfect number");
		}
		
		
	
	}

}
