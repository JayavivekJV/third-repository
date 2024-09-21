package com.java;

import java.util.Scanner;

public class Scanner_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		System.out.println("Enter age");
		System.out.println("Enter salary");
		String name=sc.nextLine();
		int age=sc.nextInt();
		double salary=sc.nextDouble();
		System.out.print("I am " +name);
		System.out.print(". I am " +age+" years old");
        System.out.print(". My salary per month is " +salary);
        
	}

}
