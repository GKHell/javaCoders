
import java.io.*;
class ThrowVsThrows
{
	public static void main(String[] args) throws Exception{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name : ");
		String name = br.readLine();
		
		String userName = "MannuCode";

		try{
			if(!userName.equalsIgnoreCase(name))
			{
				throw new NullPointerException("Invalid Name.....");
			}
				System.out.print("Welcome "+name);
		}
		catch(NullPointerException e)
		{
			System.out.println("msg : "+e);	
		}

	}
}