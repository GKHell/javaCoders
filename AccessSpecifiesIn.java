
class AccessSpecifiesIn
{
	public static void main(String[] args) {

		B b = new B();
		b.getData();

		System.out.println("protected : "+b.subject);
	}
}
class A{

	public String name="Rio";
	protected String subject = "python";
	 float marks = 88.45f;
}
class B extends A{

	void getData()
	{
		System.out.println("   Name : "+super.name);
		System.out.println("subject : "+super.subject);
		System.out.println("  marks : "+super.marks);

	}
}