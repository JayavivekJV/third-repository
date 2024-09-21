package com.java;

public class Conditional_Statements {
	public void verifyMajor() {
		int age=17;
		if(age>=1 && age<=6) {
			System.out.println("child");
		}
		else if(age>=6 && age<=17){
			System.out.println("minor");
		}
		else if(age>=18 && age<=59) {
			System.out.println("major");
		}
		else if(age>=60 && age<=100) {
			System.out.println("senior citizen");
		}
		else {
			System.out.println("invalid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditional_Statements c=new Conditional_Statements();
		c.verifyMajor();
		

	}

}
