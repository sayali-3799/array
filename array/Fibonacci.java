package com.te.array;

public class Fibonacci {

	public static void main(String[] args) {
		int [] a=new int[10];
		a[0]=0;
		a[1]=1;
		for(int i=0;i<a.length;i++) {
		

		System.out.println(a[0]);
		  a[2]=a[0]+a[1];
		  a[0]=a[1];
		  a[1]=a[2];
		}

	}

}
