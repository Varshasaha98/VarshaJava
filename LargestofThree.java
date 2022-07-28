package com.edu;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		
		int first, second,third,large;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		first = sc.nextInt();
		second = sc.nextInt();
		third =sc.nextInt();
		
		large = (first > second && first > third)?first:(second > first && second > third)?second:third;

     System.out.println("Largest of "+first+", "+second+" and "+third+" is "+large);
     

	
	}

}
