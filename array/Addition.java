package com.te.array;
import java.util.Scanner;

public class Addition {
	public static int add(int[]array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum;
	
			
}
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements ");
		int n= sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the no of array");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
			 int d=add(array);
			System.out.println("sum is"+d);
		}
			}
		
	
