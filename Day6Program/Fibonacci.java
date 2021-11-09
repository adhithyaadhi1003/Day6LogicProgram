package com.Day6Program;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int i,a=0,b=1,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the limit n=");
		int n=obj.nextInt();
		for(i=2;i<=n;i++) {
			c=a+b;
			System.out.println(" " +c);
			a=b;
			b=c;
			
		}
				
	}

}
