package com.java;

public class Retrn {
	public int add(int a,int b){
		int sum=a+b;
		return sum;
	}
	public int sub(int a,int b) {
		int sum=a-b;
		return sum;
	}
	public int mul(int a,int b) {
		int sum=a*b;
		return sum;
	}
	public static void main(String[]args) {
		Retrn num=new Retrn();
		System.out.println(num.add(87, 13));
		System.out.println(num.sub(98, 97));
		System.out.println(num.mul(5, 3));
	}

}
