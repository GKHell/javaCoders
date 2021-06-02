
class MultipleInheritanceWithINTERFACE{
	public static void main(String[] args) {
		
		C c = new C();
		c.show();
		c.display();
	}
}
/*

A-> C
B-> C
*/
interface A{

	public void show();
}
interface B{
	public void display();
}
class C implements A,B{

	public void show()
	{
		System.out.println("Show has been called.....");
	}
	public void display()
	{
		System.out.println("display has been called....");
	}
}