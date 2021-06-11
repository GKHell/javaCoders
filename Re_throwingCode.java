
import java.util.*;
class Re_throwingCode{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		

		System.out.print("Enter the number : ");
		int n = sc.nextInt();

		try{
			Code.me(n);
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}
class Code{

	public static void me(int m)
	{

		try{
			if(m<0)
				throw new NullPointerException("-ve number ...");
		}
		catch(Exception e)
		{
			throw e;
		}

	}
}