import java.util.*;
class ColorCode{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String c1;
		String c2;
		String c3;
		String color="black";

		System.out.println("  :  (RED,GREEN,BLUE,NO) : ");
		System.out.println("Enter color 1 : ");
		c1 = sc.nextLine();

		System.out.println("Enter color 2 : ");
		c2 = sc.nextLine();
		
		System.out.println("Enter color 3 : ");
		c3 = sc.nextLine();
			
		String x1="";
		String x2="";
		String x3="";

		if(c1.equalsIgnoreCase("RED") || c2.equalsIgnoreCase("RED") || c3.equalsIgnoreCase("RED"))
				x1="RED";
		if(c1.equalsIgnoreCase("GREEN") || c2.equalsIgnoreCase("GREEN") || c3.equalsIgnoreCase("GREEN"))
				x2="GREEN";
		if(c1.equalsIgnoreCase("BLUE") || c2.equalsIgnoreCase("BLUE") || c3.equalsIgnoreCase("BLUE"))
				x3="BLUE";

		System.out.println("x1 : "+x1);
		System.out.println("x2 : "+x2);
		System.out.println("x3 : "+x3);

		if(x1.equalsIgnoreCase(""))
		{
			 if(x2.equalsIgnoreCase("GREEN") && x3.equalsIgnoreCase("BLUE"))
			 	color = "light BLUE";
			 if (x2.equalsIgnoreCase(""))
			 	color = "BLUE";
			 if (x3.equalsIgnoreCase("")) {
			 	color ="GREEN";
			 }
		}

		System.out.println("new color : "+color);
	}
}