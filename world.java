import java.io.*;
import java.util.Scanner;

public class world {
	public static void main (String[] args) {
		//if else statement program
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter A"); 
		int a = scan.nextInt();
		
		// starting with the if else statement
		if (a%2==0 || (a>=2 && a<=5)){
			if (a%2==0 || a>=6 && a<=20){
				System.out.println("Not Weird");
			}
}
		else 
		{
			System.out.println("Weird");
		}
		
	
		
		
	}

}
