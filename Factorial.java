 
 class Factorial{
 	public static void main(String[] args) {
 		
 		int n = 5;
 		Code c = new Code();
 		int x = c.fact(n);
 		System.out.println("fact : "+x);
 	}
 }
 class Code{

 	int fact(int n)
 	{
 		if(n==1)
 			return 1;
 		return n*fact(n-1);
 	}
 }
 // 5! = 5x4!
 // 4! = 4x3!