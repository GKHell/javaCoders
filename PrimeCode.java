
package AllCodes;
public class PrimeCode{

	public static boolean isPrime(int n)
	{
		// this.n=n;
		boolean f = true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				f = false;
				break;
			}

		}

		return f;
	}

	public static void printPrimes(int p,int q)
	{

		for(int n=p;n<=q;n++)
		{
				boolean f = true;
		 		for(int i=2;i<n/2;i++)
		 		{

		 			if(n%i==0)
		 			{
		 				f = false;
		 				break;
		 			}
		 		}
		 		if (f)
		 		{
		 			System.out.println("prime : "+n);

		 		}
		}
		
	}
}