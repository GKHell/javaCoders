class AbstractVsInteface{
	public static void main(String[] args) {
		
		C c = new C();
		c.show();
		c.display();
	}
}

abstract class A{ //could have concrete and abstract method  or both..

	int i = 21;
	abstract void show();
	void tell()
	{

	}
}
interface B{ // could have only abstract method...

	int j = 2;
	public void display();
}
/////////
class C extends A  implements B{

	void show()
	{
		i = 33;
		System.out.println("show has been called,,,,"+i);
	}

	public void display()
	{
		// j = 40;
		System.out.println("display has been called.........."+j);
	}

}