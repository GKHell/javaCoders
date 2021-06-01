
import java.io.*;
class BankSystem{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name : ");
		String name = br.readLine();
	
		Person p = new Person(name); 
		System.out.print("Enter the ammount : ");
		double m = Double.parseDouble(br.readLine());

		p.updateBalance(m);
	
		p.display();
	}
}

abstract class Bank{

	double ammount;
	abstract void updateBalance(double m);
}
class Person extends Bank{

	String name;
	public Person(String name)
	{
		this.name = name;
		super.ammount = 10000;
	}

	void updateBalance(double m)
	{

		if(super.ammount-m < 0)
		{
			System.out.println("Error...");
			System.exit(0);
		}

		ammount = ammount - m;
	}
	void display()
	{
		System.out.println("account HOlder Name : "+this.name);
		System.out.println("    Current Balance : "+super.ammount);
	}

}