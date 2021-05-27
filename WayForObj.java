import java.text.*;
class WayForObj{
	public static void main(String[] args)throws CloneNotSupportedException,ClassNotFoundException,InstantiationException,IllegalAccessException {
		
		Code c1 = new Code(); //way1

		NumberFormat c2 = NumberFormat.getNumberInstance(); //way 2

		Class c3 = Class.forName("Code"); //way 3

		Code c4 = (Code)c3.newInstance(); //way 4

		 Code c5 = (Code)c1.copy(); //way 5

		 System.out.println("------------------");
	}
}

class Code implements Cloneable{


	public Object copy()throws CloneNotSupportedException
	{
		return super.clone();
	}
}