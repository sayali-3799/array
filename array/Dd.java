package com.te.array;

import java.util.Scanner;

public class Dd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements ");
		int n= sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the no of array");
		
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
			int sum=0;
			int largest=0;
			int smallest=array[0];
			for(int a=0;a<n;a++) {
			
			if(array[a]>largest){
			largest=array[a];
		
			}
			if(array[a]<smallest) {
				smallest=array[a];
				
			}
			sum=smallest+largest;
			System.out.println(sum);
		
			}
		System.out.println("largest"+largest);
		System.out.println("smallest"+smallest);
		System.out.println(sum);
		
		}
		// TODO Auto-generated method stub

	}



