//imports libraries
import java.util.Random;
import java.util.Scanner;

//main method with all code

public class Towers {

	public static void main(String[] args) {
		
		//Header and introduction
		
		System.out.println("CS 210, Spring 2015");
		System.out.println("NAME: Joseph Brzoska");
		System.out.println("PROGRAMMING ASSIGNMENT 2");

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		//creating variables
		
		int w1, w2, w3, h1, h2, h3, max;
		
		//asking user input
		// odd width if not invalid is stated
		
		System.out.println("Enter the width of tower 1 (an odd number):");
		
		w1 = scan.nextInt();
		
		while (w1 % 2 == 0) {
			
			System.out.println("Invalid Input! Width needs to be odd.");
			
			w1 = scan.nextInt();
		}
		
		System.out.println("Enter the width of tower 2 (an odd number):");
		
		w2 = scan.nextInt();
		
		while (w2 % 2 == 0) {
			
			System.out.println("Invalid Input! Width needs to be odd.");
			
			w2 = scan.nextInt();
		}
		
		System.out.println("Enter the width of tower 3 (an odd number):");
		
		w3 = scan.nextInt();
		
		while (w3 % 2 == 0) {
			
			System.out.println("Invalid Input! Width needs to be odd.");
			
			w3 = scan.nextInt();
		}
		
		//making random heights with random method
		
		h1 = random.nextInt(12);
		
		while (h1 < 3 && h1 % 2 == 0) {
			
			h1 = random.nextInt(12);
		}
		
		h2 = random.nextInt(12);
		
		while (h2 < 3 && h2 % 2 == 0) {
			
			h2 = random.nextInt(12);
		}
		
		h3 = random.nextInt(12);
		
		while (h3 < 3 && h3 % 2 == 0) {
			
			h3 = random.nextInt(12);
		}
		
		System.out.print("\n");
		
		if(h1 > h2 && h1 > h3) {
			
			max = h1;
		}
		
		else if(h2 > h1 && h2 > h3) {
			
			max = h2;
		}
		
		else {
			
			max = h3;
		}
		
		//printing out towers using stars
		
		while (max > 0) {
			
			if (h1 == max ) {
				
				for (int a = 1; a <= w1; a ++) {
					
					System.out.print("*");
				}
				
				System.out.print(" ");
				
				h1 --;
			}
			
			else {
			
				for (int b = 1; b <= w1; b ++) {
					
					System.out.print(" ");
				}
			
				System.out.print(" ");
			}
			
			if (h2 == max ) {
				
				for (int c = 1; c <= w2; c ++) {
					
					System.out.print("*");
				}
				
				System.out.print(" ");
				
				h2 --;
			}
			
			else {
			
				for (int d = 1; d <= w2; d ++) {
					
					System.out.print(" ");
				}
			
				System.out.print(" ");
			}
			
			if (h3 == max) {
				
				for (int e = 1; e <= w3; e ++) {
					
					System.out.print("*");
				}
				
				System.out.print("\n");
				h3 --;
			}
			
			else {
			
				for (int f = 1; f <= w3; f ++) {
					
					System.out.print(" ");
				}
			
				System.out.print("\n");
			}
			
			max --;
			
		}	
	}
}