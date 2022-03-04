package com.tns.coreJava;

import java.util.Scanner;

public class CheckEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		int number,remainder;
		System.out.println("Pleas Enter an Integer Number");
		Scanner scan = new Scanner (System.in);
		number = scan.nextInt();
		scan.close();
		
		remainder = number % 2;
		
		if  ( remainder == 0)
		     System.out.println(number+" is an Even number");
		     
		else     
			System.out.println(number +" is an Odd number");	
		
	}

}
