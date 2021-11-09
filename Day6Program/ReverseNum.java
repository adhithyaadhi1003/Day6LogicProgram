package com.Day6Program;
import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int rev=0,rem;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the number to reverse n=");
		int n=obj.nextInt();
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("the reversed number is " +rev);
	}

}
