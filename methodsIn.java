/*

	returnType FunName (args...)
	{
	
		//task
	}
*/

class methodsIn
{
	public static void main(String[] args) {
		
		Data d = new Data();
		d.printCode("Morncsa");	//m1

		Data.say(); //m2
	}
}

class Data{

	void printCode(String msg)// m1 : instance method which must be called by object
	{
		System.out.println("hello "+msg);
	}

	static void say() //m2 : static method which could be called by object or className
	{
		System.out.println("welcome 2 helloWorld..");
	}
}