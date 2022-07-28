package com.edu;

import java.util.Scanner;

public class CheckNumberAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
