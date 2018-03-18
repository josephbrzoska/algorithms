import java.util.Random;
import java.util.Scanner;

public class Towers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random randnum = new Random();
		
		int w1, w2, w3, h1, h2, h3, max;
		
		System.out.println("Enter an odd number");
		
		w1 = scan.nextInt();
		
		while (w1 % 2 == 0) {
			
			System.out.println("Your first width was an even, type in an odd number.");
			
			w1 = scan.nextInt();
		}
		
		System.out.println("Emter an odd number");
		
		w2 = scan.nextInt();
		
		while (w2 % 2 == 0) {
			
			System.out.println("your second width was an even, type in an odd number.");
			
			w2 = scan.nextInt();
		}
		
		System.out.println("Emter an odd number");
		
		w3 = scan.nextInt();
		
		while (w3 % 2 == 0) {
			
			System.out.println("your third width was an even, type in an odd number.");
			
			w3 = scan.nextInt();
		}
		
		h1 = randnum.nextInt(12);
		
		while (h1 < 3 && h1 % 2 == 0) {
			
			h1 = randnum.nextInt(12);
		}
		
		h2 = randnum.nextInt(12);
		
		while (h2 < 3 && h2 % 2 == 0) {
			
			h2 = randnum.nextInt(12);
		}
		
		h3 = randnum.nextInt(12);
		
		while (h3 < 3 && h3 % 2 == 0) {
			
			h3 = randnum.nextInt(12);
		}
		
		System.out.print("\n");
		
		if (h1 > h2 && h1 > h3) {
			
			max = h1;
		}
		
		else if (h2 > h1 && h2 > h3) {
			
			max = h2;
		}
		
		else {
			
			max = h3;
		}
		
		while (max > 0) {
			
			if (h1 == max) {
				
				for (int a = 1; 1 <= w1; a++) {
					
					System.out.print("*");
				}
				
				System.out.print(" ");
				
				h1 --;
			}
			
			else {
				
				for (int b = 1; b <= w1; b++) {
					System.out.print(" ");
				}
				
				System.out.print(" ");
			}
			
			if (h2 == max) {
				
				for (int c = 1; c <= w2; c++) {
					
					System.out.print("*");
				}
				
				System.out.print(" ");
				
				h2 --;
			}
			
			else {
				
				for (int d = 1; 1 <= w2; d++) {
					
					System.out.print(" ");
				}
				
				System.out.print(" ");
			}
			
			if (h3 == max) {
				
				for (int e = 1; e <= w3; e++) {
					
					System.out.print("*");
				}
				
				System.out.print("\n");
				
				h3 --;
			}
			
			else {
				
				for (int f = 1; f <= w3; f++) {
					
					System.out.print(" ");
				}
				
				System.out.print("\n");
			}
			
			max --;
		}
	}
}