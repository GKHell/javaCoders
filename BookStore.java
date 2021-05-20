
import java.io.*;
class BookStore{
	public static void main(String[] args)throws IOException {
		
		Book myBook = new Book();
		// myBook.setData();
		myBook.display();

	}
}

class Book{

	private String name;
	private String authorName;
	private float price;
	private int edition;

	void setData() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name : ");
		name = br.readLine();

		System.out.print("Enter the Authorname : ");
		authorName = br.readLine();

		System.out.print("Enter the price : ");
		price = Float.parseFloat(br.readLine());

		System.out.print("Enter the edition : ");
		edition = Integer.parseInt(br.readLine());

	}
	void display()
	{
		System.out.println("\t       name : "+name);
		System.out.println("\t authorName : "+authorName);
		System.out.println("\t      price : "+price);
		System.out.println("\t    edition : "+edition);

	}
}