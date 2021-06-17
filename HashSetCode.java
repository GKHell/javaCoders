
import java.util.*;
class LinkedHashSetCode{
	public static void main(String[] args) {
		
		LinkedHashSet<String> list = new LinkedHashSet<String>();

		Scanner sc = new Scanner(System.in);
		// list.add("python 1");
		// list.add("python 2");
		// list.add("python 3");
		// list.add("python 4");
		// list.add("python 5");
		// list.add("python 5");
		// list.add("python 6");

		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.print("\nEnter the data : \n");
	
		for(int j=0;j<n;j++)
		{
			System.out.print("Enter  : ");
			list.add(sc.nextLine());
		}
		////// methods : 
			list.add("finalCode");

			System.out.print("Enter data to remove : ");
			String s = sc.nextLine();
			list.remove(s);


			System.out.print("Enter the data to find : ");
			s = sc.nextLine();
			System.out.println("finding "+s+" in list : "+list.contains(s));

		/////
		// Iterator i;
		// i = list.iterator();
		// while(i.hasNext())
		// {
		// 	System.out.print("\ncode : "+i.next());
		// }

		for(String me:list)
		{
			System.out.println(" -------- : "+me);
		}
		System.out.println("\nstatus 1 : "+list.isEmpty());
		list.clear();
		System.out.println("status 2 : "+list.isEmpty());

	}
}