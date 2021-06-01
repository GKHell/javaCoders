
class ObjectClass{
	public static void main(String[] args) {
		
		System.out.println("status 1 : "+Cal.cmp("we","we"));
	}
}

class Cal{


	 static boolean cmp(Object a,Object b)
	{
		return a==b;
	}
}