
class ObjectRelation{
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();

		b1.msg = "Python";
		b2.msg = "java";
	
		A a = new A(b2);
		a.print();
	}
}

B['msg'] -> A
class A{

	int x;
	B b;
	public A(B obj)
	{
		b = obj;
	}

	void print()
	{
		System.out.println("msg : "+b.msg);
	}	
}
class B{
	String msg="Hello World";
}