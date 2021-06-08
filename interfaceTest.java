

import myCode.interfaceCode;
class interfaceTest{
	public static void main(String[] args) {
		
		A obj = new A();

		obj.say();
		obj.tell("Python....");
	}
}
class A implements interfaceCode
{
	public void say()
	{
		System.out.println("Hello THERE....");
	}

	public void tell(String name)
	{
		System.out.println("Hello "+name);
	}
}
