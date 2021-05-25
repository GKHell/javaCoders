class Recursion
{
	public static void main(String[] args) {
		
		Data d = Data();

		d.Data();
	}
}
class Data{

	void show()
	{

		System.out.println("hello world...");
		show();
	}
}