 
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
 		System.out.println(n+" :  ");

 		if(n==1)
 			return 1;
 		int ans = n*fact(n-1);
 		System.out.println(" :  "+ans);
 		return ans;
 	}
 }
 // 5! = 5x4x3x2x1
 // 4! = 4x3!