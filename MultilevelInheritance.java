
class MultilevelInheritance{
	public static void main(String[] args) {
	
		C c = new C();
		c.sayc();
	
		B b = new B();
	}
}
class A{

		public A()
		{
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA "+this);
		}
		void saya()
		{
			System.out.println("class A "+this);
		}
}
class B extends A{


		public B()
		{
			System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb "+this);
		}

		void sayb()
		{
			System.out.println("class B "+this);
		}
}
class C extends B{


		public C()
		{
			System.out.println("cccccccccccccccccccccccccccccc "+this);
		}
		void sayc()
		{
			System.out.println("class C "+this);
		}
}	