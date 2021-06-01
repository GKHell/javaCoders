
class AbstractCode{
	public static void main(String[] args) {
	
		B b = new B();
		b.display();
		b.say(10);	
	}
}

abstract class A{


	abstract void say(int x); //abstract method

	void display() //concrete method
	{
		System.out.println("Hello World");
	}
}
class B extends A{

	void say(int a) // concrete of B class 
	{
		System.out.println("hey tx for "+a+"Rs");	
	}
}