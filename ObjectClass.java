
class ObjectClass{
	public static void main(String[] args) throws CloneNotSupportedException,Throwable{
		
		System.out.println("status 1 : "+Cal.cmp("we","we"));

		Cal c1 = new Cal();
		Cal c2 = c1;



		System.out.println("toString : "+c1.toString());

		System.out.println("  equals : "+c1.equals(c2));

		System.out.println("  class  : "+c1.getClass());
		System.out.println("  hashcode: "+c1.hashCode());

		Cal c3 = (Cal)c1.clone();

		c1.finalize();

	}
}

class Cal implements Cloneable{


	 static boolean cmp(Object a,Object b)
	{
		return a==b;
	}

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	protected void finalize() throws Throwable
	{
		 super.finalize();
	}

	// public String toString()
	// {
	// 	return  super.toString()+" HELL";
	// }
}