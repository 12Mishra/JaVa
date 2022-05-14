import java.util.Scanner;

public class hello {
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number"); //input
		int a = scan.nextInt();
		System.out.println("Enter a number");
		int b= scan.nextInt();
		
		
		int c=a+b; //output
		System.out.println("Value is: ");
		System.out.println(c);
		
		
	}

}
