
package myColors;
public class Colors{

	public static void printRED(String str)
	{
		System.out.println("\u001B[31m"+str+"\u001B[0m");
	}
	public static void printBLUE(String str)
	{
		System.out.println("\u001B[34m"+str+"\u001B[0m");
	}
}