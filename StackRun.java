
import java.util.*;
class StackRun
{
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);
		int n = 0;
		do{
			System.out.println("\n  Enter 1 for push(1):");
			System.out.println("    Enter 2 for pop(2):");
			System.out.println("   Enter 3 for peek(3):");
			System.out.println(" Enter 4 for search(4):");
			System.out.println("Enter 5 for display(5):");
			System.out.println("     Enter 6 for exit :");
			System.out.print("         Enter choice : ");
			n = sc.nextInt();

				switch(n)
				{
					case 1:
							System.out.print("\tEnter the number : ");
							int x = sc.nextInt();
							list.push(x);
							break;
					case 2:
							System.out.println("\tElement has been deleted : "+list.pop());
							break;
					case 3:
							System.out.println("\t\tlast element : "+list.peek());
							break;
					case 4:
							System.out.print("\tEnter element to Search : ");
							int d = sc.nextInt();
							System.out.println("\tSearch "+d+" in list = "+list.search(d));
							break;
					case 5:
							System.out.println("\t\tlist : "+list);
							break;
					case 6:
							System.out.println("Exit......");
							System.exit(0);
					default:
							System.out.println(" try again......,");
				}

		}while(true);
	}
}