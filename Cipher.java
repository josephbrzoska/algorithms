//CS 210, Spring 2015
//NAME: Joseph Brzoska
//PROGRAMMING ASSIGNMENT 1


import java.util.Random; /*importing random and scanner libraries*/
import java.util.Scanner;

public class Cipher { /*name of class is the same as project file*/
	
	// All functional code is in public static void main

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		// creating integer variables
		
		int n1, n2, n3, n4, n5, random, total1, total2, total3, code1, code2;
		
		System.out.println("Cipher Program");
		System.out.println("Put in 5 numbers 0 through 19");
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		n4 = scan.nextInt();
		n5 = scan.nextInt();
		
		total1 = n1 + n2 + n3 + n4 + n5;
		
		//Displays the entered numbers of the user
		
		System.out.println("1st number: " + n1);
		System.out.println("2nd number: " + n2);
		System.out.println("3rd number: " + n3);
		System.out.println("4th number: " + n4);
		System.out.println("5th number: " + n5);
		
		total2 = total1 / 10;
		total3 = total1 % 10;
		
		Random ran = new Random();
		
		random = ran.nextInt(9); /*using random to create a number 0 through 9*/
		
		code1 = (total2 + random) % 10;
		code2 = (total3 + random) % 10;
		
		//All System.out lines display information back to the user
		
		System.out.println("Total = " + total1);
		System.out.println("Your random key is " + random);
		System.out.println("The encoded number is " + code1 + "" + code2);
		
	}

}
