
import java.io.*;
class UserDefinedException{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the mobile number : ");
		String number = br.readLine();

		// to check there are only numbers in 'number'
		boolean f = false;
		try{
			Double.parseDouble(number);
			f = true;
		}
		catch(Exception e)
		{
			f = false;
		}
		if (!f)
		{
			System.out.println("try again.....");
			System.exit(10);
		}	
		try{

			if(number.length()!=10)
				throw new MobileCode("digits doest'n match to 10..");
		}
		catch(MobileCode m){
			System.out.println("Message : "+m);
			m.info();
		}

		System.out.println("Code : "+number);
	}
}
class MobileCode extends Exception{

		public MobileCode()
		{
			super();
		}
		public MobileCode(String msg)
		{
			super(msg);
		}
		public void info()
		{
			System.out.println("to check the number validity...");
		}
}