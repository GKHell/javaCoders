
import java.util.*;
import java.io.*;

class VectorCode{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<String> lang = new Vector<String>();

		lang.add("php");
		lang.add("python");
		lang.add("html");
		lang.add("ruby");

		int n = 0;
		do{

			System.out.println("\u001B[31m            press 1 for add (1): ");
			System.out.println("press 2 for add at sp.index (2): ");
			System.out.println("  press 3 for remove object (3): ");
			System.out.println("press 4 for remove sp. index(4): ");
			System.out.println("         press 5 for display(5): ");
			System.out.println("       press 6 for clear all(6): ");
			System.out.println("            press 7 for exit(7): \u001B[00m");
			  System.out.print("                  Enter choice : ");
			  n = Integer.parseInt(br.readLine());
			  int x;

			  switch (n) {
			  		case 0: System.out.println("this is a case with 0 hatters..");
			  				break;
			  		case 1: System.out.print("Enter data : ");
			  				lang.add(br.readLine());
			  				System.out.println("insertion done.");
			  				break;

			  		case 2: System.out.print("Enter index no : ");
			  				x = Integer.parseInt(br.readLine());
			  				System.out.print("Enter the data : ");
			  				lang.add(x,br.readLine());
			  				System.out.println("insertion done.");
			  				break;

			  		case 3: 
			  				System.out.print("Enter the elment ,which you want to delete : ");
			  				lang.remove(br.readLine());
			  				System.out.println("Element  has been removed..");
			  				break;

			  		case 4:
			  				System.out.print("Enter the index which you want to delete : ");
			  				x = Integer.parseInt(br.readLine());
			  				System.out.println("Element  "+lang.remove(x)+"has been removed..");
			  				break;
			  				
			  		case 5: System.out.println("\n------------data--------------\n");
			  				Iterator i = lang.iterator();
							int j = 0;
							while(i.hasNext())
							{
								System.out.println((j++)+" -> "+i.next());
							}
							break;

					case 6: lang.clear();
							System.out.println("all data has been cleared.. ");
							break;

					case 7 :
							System.out.println("Error.. Exiting....");
							System.exit(65);

					default : System.out.println("try zero ........");

			  }
		}while(n<=7);
	}
}