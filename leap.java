import java.io.*;
import java.util.Scanner;
public class leap {
	public static void main(String[]args) {

		System.out.println("Enter year to check: ");
		
		Scanner scan= new Scanner(System.in);
		int year= scan.nextInt();{
		
	
			if (year%4==0) 
	{
				if (year%100==0)
		{
					if (year%400==0)
			{
						System.out.println("Year is a leap year");
				
			}
		}
	}
	
			else {
				System.out.println("Entered year is not leap");
		
	}
}
		
	}
}

