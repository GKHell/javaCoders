
class AnonymousJava{
	public static void main(String[] args) {
		
		Code c = new Code();
		c.obj.show();
		System.out.println("Data : "+c.obj.i);
	}
}
interface Hell{
	final int i =130;
	public void show(); //abstract method
}
class Code{

	Hell obj = new Hell(){
		// public int i=130;
		public void show()
		{
			System.out.println("Hello World..."+i);
		}
	};
}