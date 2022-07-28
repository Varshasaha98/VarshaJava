package com.edu;

import java.util.Scanner;

public class Checknumber {
	public static void main() {
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter your number here");
		if(num<0) {
			System.out.println("Number is negative");
		}
		if(num==0) {
			System.out.println("Number is zero");
			
		}
		if(num>0) {
			System.out.println("Number is positive");
		}

	}
}
