
import java.util.*;
class StackCode{
	public static void main(String[] args) {
		
		Stack<String> list = new Stack<String>();

		list.push("python 1");
		list.push("python 2");
		list.push("python 3");
		list.push("python 4");
		list.push("python 5");
		list.push("python 6");


		for(String s : list)
		{
			System.out.println("data : "+s);
		}

		System.out.println("\n\nempty status 1: "+list.empty());

		list.pop();
		list.pop();
		list.pop();

		System.out.println("empty status 2: "+list.empty());
		System.out.println(" last element : "+list.peek());
		System.out.println("       search : "+list.search("python 1"));
	}
}