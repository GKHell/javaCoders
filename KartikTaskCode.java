// 123321
//  2332
//   33
//    3

class Task{
	public static void main(String[] args) {
	
		Code c = new Code();
		c.showPattern(12345);	
	}
}

class Code{

	int num;
	int rev=0;
	int rem;
	boolean f = true;
	void showPattern(int n)
	{

			int reverse = revCode(n);
			// System.out.println(n+""+reverse);
		
		int j=0;
		while(reverse>0)
		{
			
			int r = revCode(reverse);
			space(j);
			System.out.println(r+""+reverse);

			reverse /= 10;

			if(reverse<=0)
			{
				space(j);
				System.out.println(r);
			}

			j++;
		}
	}

	void space(int n)
	{
			for(int i=0;i<n;i++)
			{
					System.out.print(" ");
			}
	}
	int revCode(int n)
	{
		rev = 0;

		while(n>0)
		{
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}

		return rev;
	}
}