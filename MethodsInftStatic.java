class methodsInft_Static
{
	static{
		int a=10;
		int b = 109;
		System.out.println("+_+_+_+_+_+_+_+)+)+)+)"+(a+b));
	}
	public static void main(String[] args) {
		
		Data x = new Data();//id = 1
		x.tell(); // i = 6
		 
		Data y = new Data(); //id = 6
		y.tell();//i =11
		
		Data z = new Data(); // id = 11
		z.tell(); // id = 16
		
	}
}

class Data{

	static int i=1; //static variable
		Data()
		{
			System.out.println("Object id : "+i);
			i+=5;
		}

		void tell()
		{
			System.out.println(this+"value of i = "+i);
		}
}