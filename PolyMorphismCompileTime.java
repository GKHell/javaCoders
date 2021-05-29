class PolyMorphismCode{
	public static void main(String[] args) {

		Code cal = new Code();

		int a=10;
		int b=20;
		int c=30;

		System.out.println(a+" + "+ b+ " = "+(cal.sum(a,b)));
		System.out.println(a+" + "+ b+ " + "+c+" = "+(cal.sum(a,b,b)));

	}
}

class Code{//static / compile time.../method overloading...

	int sum(int a,int b) //m1
	{
		return a+b;
	}
	int sum(int a,int b,int c) //m2
	{
		return a+b+c;
	}
}
