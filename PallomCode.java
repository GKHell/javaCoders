package AllCodes;
public class PallomCode{

	public static boolean isPallom(int n)
	{
		int temp;
		temp = n;
		int rev=0,rem;
		while(n>0)
		{
			rem = n % 10;
			rev = rev*10+rem;
			n = n / 10;
		}
		return temp==rev;
	}
}

/*
	 n(n/10) 			rem(n%10)		rev(rev*10+rem)
	   123                3					   3
	   12 				  2                    32
	   1 				  1                    321       
*/