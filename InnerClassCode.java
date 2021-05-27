import java.util.*;
class InnerClassCode
{

	public static void main(String[] args) {
		Person p = new Person("RohitCodes"); 
		p.register();
		p.logInFb();
	}
}

class Person{

	String Name;
	Login l;
	Scanner sc;
	public Person(String Name)
	{
		this.Name = Name;
		sc = new Scanner(System.in);
	}
	public void register()
	{
		l = new Login();
		System.out.print("Enter username  : ");
		l.uN = sc.nextLine();

		System.out.print("Enter password  : ");
		l.uP = sc.nextLine();
			
	}
	void logInFb()
	{
		String username;
		String password;
		System.getRuntime("ls");
		System.out.print("Enter username for login : ");
		username = sc.nextLine();

		System.out.print("Enter password for login : ");
		password = sc.nextLine();
		
		boolean f = l.validLogin(username,password);

		if(f)
		{
			System.out.print("login Done..");
		}
		else
		{
			System.out.println("Login Fails...");
		}
	}
	class Login{

		String uN;
		String uP;
	 
		boolean validLogin(String userName,String password)
		{
			return uN.equals(userName) && uP.equals(password);
		}
	}
}