
class typeCast{
	public static void main(String[] args) {

	 // lower to higher  //implicit  //widening

		int i = 40;
		float f = i;

		System.out.println("f : "+f);


   // higher to lower // explicit // narrowing

		float x = 30.5f;
		int y = (int)x;
		System.out.println("y : "+y);

	/////////////////////////////



		
		A a = new B();
		B b = (B)a; // specilazation  //super -> child

		b.say1();
		b.say2();

		//////////////////////////
		A objA = new B();// child to super // generalization
		objA.say1();

	}
}

class A
{
	void say1()
	{
		System.out.println("hello A");
	}
}


class B extends A
{
	void say2()
	{
		System.out.println("hello B");
	}
}