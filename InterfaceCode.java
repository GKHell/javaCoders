
class InterfaceCode{ 
	public static void main(String[] args) {
	
		Code c = new Code();
		c.display();	
	}

}
interface Rules{

		public void display(); //abstract method...

}
class Code implements Rules{


	public void display()
	{

		System.out.println("Hello World....");
	}
}