import java.util.*;
import java.text.*;
class NumberFormat1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary : ");
		double salary = sc.nextDouble();

		System.out.println("Net salary : "+salary);

		NumberFormat obj = NumberFormat.getNumberInstance();
		obj.setMaximumFractionDigits(3);
		obj.setMinimumIntegerDigits(4);

		String s = obj.format(salary);

		System.out.println("formated salary : "+s);

	}
}