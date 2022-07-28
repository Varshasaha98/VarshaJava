package com.edu;

import java.util.Scanner;

public class UserDataInputMain {

	public static void main(String[] args) {
		String name;
		int age;
		float fees;
		double amount;
		char gen;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println("enter fees");
		fees = sc.nextFloat();
		System.out.println("enter total amount");
		amount = sc.nextDouble();
		System.out.println("enter gender");
		gen = sc.next().charAt(0);
		
		System.out.println("your details are");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Fees="+fees);
		System.out.println("Total amount="+amount);
		System.out.println("Gender="+gen);
		
		// TODO Auto-generated method stub

	}

}
