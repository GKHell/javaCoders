
import java.util.*;

class multiCatch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,0,3,5};
		int sum=0;

		for (int i :a){
			sum+=i;
		}

		System.out.print("Enter the index value : ");
		int x = sc.nextInt();

			try{

			System.out.println("index  : "+x);
			System.out.println("  sum  : "+sum);
			System.out.println("  data : "+a[x]); //ArrayIndexOutOfBoundsException

				int num = a[x]; //   execption when x >= a.lenght() ArrayIndexOutOfBoundsException
				double d = sum/num; // bcz num==0 ArithmeticException 
				System.out.println("ans : "+d);
				sc.getClass().getMethod("nextInts"); //default exception...
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Hello 1,there is an error.."+e);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Hello 2,there is an error.."+e);
			}
			catch(Exception e)
			{
				System.out.println("Default Exception ............");
			}

	}
}