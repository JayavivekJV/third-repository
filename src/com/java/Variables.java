package com.java;

public class Variables {
	static int a=4;
	int instancevar=5;
	
	public static void main(String[]args) {
		Variables obj=new Variables();
		obj.local_Variable();
	}
	private void local_Variable() {
		int d=10;
		System.out.println(instancevar);
		System.out.println(a);
		System.out.println(instancevar);
		
		System.out.println(d);
	}

}
