package com.edu;

import java.util.Scanner;

public class ConditionalIf {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Enter your age");
		
		if(num==18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}

}
