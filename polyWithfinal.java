class polyWithfinal{
	public static void main(String[] args) {
		
		B b = new B();
		b.say2();
	}
}
class A{

	final void say1()
	{
		System.out.println("we are in Class A");
	}
}
class B extends A{

	void say2()
	{
		say1();
		System.out.println("we are in Class B");

	}
}