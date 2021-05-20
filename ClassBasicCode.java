
// properties = > variables
// action => methods

class ClassBasicCode
{
		
	public static void main(String[] args) {
		
		/*
			int a;
			a = 20;
			-------------
			int a = 20;
		*/
		Book a1 = new Book();
		Book a2 = new Book();

			a1.name = "fysCote";
			a1.price = 12;


			System.out.println("name : "+a1.name);
			System.out.println("price : "+a1.price);


		System.out.println("a1 : "+a1.hashCode());
		System.out.println("a2 : "+a2.hashCode());
 
		}
}
class Book{

	String name;
	String authorName;
	float price;
	int edition;
}