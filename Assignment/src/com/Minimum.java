package com;

import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("------------------------");
		System.out.println("Enter "+size+" Elements in Array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("-------------------------");
		for(int i=0;i<a.length;i++) {
			System.out.println("Element of Index "+i+" is: "+a[i]);
		}
		System.out.println("------------------------");
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(small>a[i])
				small=a[i];
		}
		System.out.println("The Smallest Element in the Array is: "+small);

	}
}
