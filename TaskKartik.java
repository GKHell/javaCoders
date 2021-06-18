
import java.util.*;
class TaskKartik{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int start = sc.nextInt();

		System.out.print("Enter Number : ");
		int end = sc.nextInt();

		if(start > end)
		{
			start = start+end;
			  end = start-end;
			start = start-end;
		}

		while(start<=end)
		{
			System.out.println("========> "+start++);
		}
	}
}