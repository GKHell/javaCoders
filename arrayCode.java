
import java.util.*;
class Code{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size : ");
		int n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter the array : \n");
		for(int i =0;i<n;i++)
		{
			System.out.print("a[ "+i+" ] = ");
			a[i] = sc.nextInt();
		}

		System.out.println("\n-----------------------\n");
		// x = a[i];
		for(int x:a) //for-each
		{
			System.out.println("==> : "+x);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("----------- : "+a[i]);
		}
	}
}