import java.util.Random;
import java.util.Scanner;


public class Sky {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int width1, width2, width3;
		
		System.out.println("Enter an odd number");
		width1 = scan.nextInt();
		
		while (width1 % 2 == 0)
		{
			System.out.println("Your first width was an even, type in an odd number.");
			width1 = scan.nextInt();
		}
		
		System.out.println("Enter an odd number");
		width2 = scan.nextInt();
		
		while (width2 % 2 == 0)
		{
			System.out.println("Your second width was an even, type in an odd number.");
			width2 = scan.nextInt();
		}
		
		System.out.println("Enter an odd number");
		width3 = scan.nextInt();
		
		while (width3 % 2 == 0)
		{
			System.out.println("Your third width was an even, type in an odd number.");
			width3 = scan.nextInt();
		}
		
		Random random = new Random();
		
		int height1, height2, height3;
		
		height1 = random.nextInt(12);
		while (height1 < 3 && height1 % 2 == 0)
		{
			height1 = random.nextInt(12);
		}
		
		height2 = random.nextInt(12);
		while (height2 < 3 && height2 % 2 == 0)
		{
			height2 = random.nextInt(12);
		}
		
		height3 = random.nextInt(12);
		while (height3 < 3 && height3 % 2 == 0)
		{
			height3 = random.nextInt(12);
		}
		
		System.out.print("\n");
		
		int max;
		
		if(height1 > height2 && height1 > height3)
		{
			max = height1;
		}
		
		else if(height2 > height1 && height2 > height3)
		{
			max = height2;
		}
		
		else
		{
			max = height3;
		}
		
		while (max > 0)
		{
			if (height1 == max )
			{
				for (int i = 1; i <= width1; i ++)
				{
					System.out.print("*");
				}
				
				System.out.print(" ");
				height1 --;
			}
			
			else
			{
			
				for (int j = 1; j <= width1; j ++)
				{
					System.out.print(" ");
				}
			
				System.out.print(" ");
			}
			
			if (height2 == max )
			{
				for (int k = 1; k <= width2; k ++)
				{
					System.out.print("*");
				}
				
				System.out.print(" ");
				height2 --;
			}
			
			else
			{
			
				for (int l = 1; l <= width2; l ++)
				{
					System.out.print(" ");
				}
			
				System.out.print(" ");
			}
			
			if (height3 == max )
			{
				for (int m = 1; m <= width3; m ++)
				{
					System.out.print("*");
				}
				
				System.out.print("\n");
				height3 --;
			}
			
			else
			{
			
				for (int n = 1; n <= width3; n ++)
				{
					System.out.print(" ");
				}
			
				System.out.print("\n");
			}
			
			max --;
			
		}
		
		
		
		
		
		
		

	}

}