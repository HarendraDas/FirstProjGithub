package com.biki.demo;

import java.util.Scanner;

public class AddUntilOneDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");;
		int n=sc.nextInt();

		while(n>10) {
			int sum=0;

			while(n>0) {
				sum+=n%10;
				n/=10;
			}
			n=sum;
		}
		System.out.println("Digit Root is : "+n);
		sc.close();
	}

}
