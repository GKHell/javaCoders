
// 1 | compile time | syntax error | typing error  | javac
// 2 | runtime error| logical error| java
import java.util.*;
class ErrorsInJava{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double c=0;
		System.out.println("Hello World.....");
		
		System.out.print("Enter the number : ");
		int a = sc.nextInt();


		System.out.print("Enter the number : ");
		int b = sc.nextInt();
		
		try
		{
			c = a/b;
			System.out.println("\n--------------------------\n");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("there is an error...");
		}

		System.out.println("ans : "+c);

	}
}