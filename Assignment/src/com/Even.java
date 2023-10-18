package com;
import java.util.Scanner;
public class Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("------------------------");
		System.out.println("Enter "+size+" Values in Array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("------------------------");
		for(int i=0;i<a.length;i++) {
			System.out.println("The value of index "+i+" is: "+a[i]);
		}
		String s="";
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				s=s+" "+a[i];
		}
		System.out.println("Even elements in Array are: "+s);
	}
}
