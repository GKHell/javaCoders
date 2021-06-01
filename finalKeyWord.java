class polyWithfinal{
	public static void main(String[] args) {
		
		B b = new B();
		b.say2();

		System.out.println("content in i : "+b.i);
		// b.i = 300; // it gives error....
		System.out.println("content in i : "+b.i);

	}
}
final class A{

	final void say1()
	{
		System.out.println("we are in Class A");
	}
}
class B {

	final int i = 100;
	void say2()
	{
		// say1();
		System.out.println("we are in Class B");

	}
}