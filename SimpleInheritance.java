
class SimpleInheritance{
	public static void main(String[] args) {
	
		B b = new B();
		b.show();	
		
		A a = new A();
		a.show();
	}
}
class A{

	protected void show()
	{
		System.out.println("\'this\' in A class : "+this);
	}
}
class B extends A{

}