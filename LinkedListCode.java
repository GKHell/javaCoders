
import java.util.*;
import java.io.*;
class LinkedListCode{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<String> list = new LinkedList<String>();

		list.add("python");
		list.add("java");
		list.add("php");
		list.add("c#");
		list.add("python");
		list.add("python");
		list.add("html");


		list.addFirst("Ruby");
		list.addLast("perl");

		list.remove("java"); 

		list.removeLast();
		list.removeFirst();
		Iterator i = list.iterator();
		int j =0;
		while(i.hasNext())
		{
			System.out.println(" "+(j++)+" : "+i.next());
		}

		System.out.print("Enter the index no to insert : ");
		int n = Integer.parseInt(br.readLine());

		System.out.print("Enter the element : ");
		list.add(n,br.readLine());

		i = list.iterator();
		j = 0;
		while(i.hasNext())
		{
			System.out.println(" "+(j++)+" : "+i.next());
		}

		System.out.print("Enter the index for element : ");
		System.out.println("data  : "+list.get(Integer.parseInt(br.readLine())));
		System.out.println("first Element : "+list.getFirst());
		System.out.println(" last Element : "+list.getLast()); 

		System.out.println("\n\n\n");
		System.out.print("Enter index to replace the data : ");
		n = Integer.parseInt(br.readLine());

		System.out.print("Enter data for replace : ");
		list.set(n,br.readLine());

		i = list.iterator();
		j = 0;
		while(i.hasNext())
		{
			System.out.println("\t "+(j++)+" : "+i.next());
		}

		System.out.print("enter element to Search : ");
		String s = br.readLine();

		System.out.println("first index  : "+list.indexOf(s));
		System.out.println("first index  : "+list.lastIndexOf(s));

		System.out.println("total elements : "+list.size());

		
		Object a[] = list.toArray();
		list.clear();
		System.out.println("\n");
		for(int k=0;k<a.length;k++)
		{
			System.out.println("a[ "+k+"] = "+a[k]);
		}
	}
}