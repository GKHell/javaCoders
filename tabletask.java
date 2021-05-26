
class Table{
	public static void main(String[] args) {
		
		Code.print(10);
	}
}

class Code{

	static void print(int n)
	{
		 
		if(n==0)
			return;
		print(n-1);
		// System.out.println(5+" x "+n+" = "+(n*5));
		System.out.printf("%3d x %2d = %3d\n",5,n,n*5);

// print
// printf
// println
	}
}