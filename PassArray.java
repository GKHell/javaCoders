
import java.util.*;
class PassArray{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			System.out.print("a [ "+i+" ]  = ");
			a[i] = sc.nextInt();
		}

		Code.sort(a);
		System.out.println("--------------------------- : ");
		for(int i=0;i<n;i++)
		{
			System.out.println("a [ "+i+" ]  = "+a[i]);

		}
	}
}
class Code{

	static void sort(int a[])
	{
		for(int i =0 ;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					a[i] = a[i]+a[j];
				   a[j] = a[i]-a[j];
				 a[i] = a[i]-a[j];

				}
			}
		}
	}
}