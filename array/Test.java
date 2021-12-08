package com.te.array;

public class Test {
	public static void main(String[]args) {
		int []a= {1,2,32,45,67,87,98,7,0,-1,8,9,6,8,1};
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(smallest>a[i]) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);
		}

}

