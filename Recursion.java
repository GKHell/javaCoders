
class Recusion{
	public static void main(String[] args) {
		
		int x = Code.say(10);

		System.out.println("o/p : "+x);
	}
}
class Code{
	static int say(int n)
	{
		if(n==0)
			return 'A';
		System.out.println("Hello World..... "+n);
	
		int x = say(n-2);

		System.out.println("\tHello World..... "+n+"\t"+x);

	return 0;
	}
}