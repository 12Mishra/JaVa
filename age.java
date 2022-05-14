import java.io.*;

import java.util.Scanner;

public class age {
	public static void main(String[]args) {
			System.out.println("Enter your age: ");
				
			Scanner scan = new Scanner(System.in);
			{
			int age= scan.nextInt();
	
			if (age>=18){
				System.out.println("Eligible");
			}
			else {
				System.out.println("Not Eligible");
				
			}
		}
	}

}
