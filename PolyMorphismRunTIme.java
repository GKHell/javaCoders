class PolyMorphismCode{
	public static void main(String[] args) {

	 Code c = new Run();
	 c.display();

	}
}

class Code{//method overriding.../ Runtime / dynamic

	void display()
	{
		System.out.println("Code class ....");
	}
}
class Run extends Code{


	void display()
	{
		super.display();
		System.out.println("Run class ....");
	}
}

