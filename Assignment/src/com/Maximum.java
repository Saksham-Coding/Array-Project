package com;

import java.util.Scanner;

public class Maximum 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("------------------------");
		System.out.println("Enter "+size+" in the Arrays:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("------------------------");
		for(int i=0;i<a.length;i++) {
			System.out.println("Elements of Index "+i+" is "+a[i]);
		}
		System.out.println("------------------------");
		int big=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
		}
		System.out.println("The Biggest Element in Array is: "+big);
	}

}
