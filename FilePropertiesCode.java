
import java.util.*;
import java.io.*;
class FileProperties{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		File file = new File("code.cpp");	

		// System.out.println("     isFile : "+file.isFile());
	 // 	System.out.println("isDirectory : "+file.isDirectory());
	 // 	System.out.println("    canRead : "+file.canRead());
	 // 	System.out.println("   canWrite : "+file.canWrite());
	 // 	System.out.println(" canExecute : "+file.canExecute());
	 // 	System.out.println("     exists : "+file.exists());
		
		// System.out.println("      getParent : "+file.getParent());
		// System.out.println("getAbsolutePath : "+file.getAbsolutePath());
		// System.out.println("   length(size) : "+file.length()+" bytes");

		System.out.println("\n-----------------------------------\n");
		// System.out.print("Enter the file to delete : ");
		// String fileName = br.readLine();

		// file = new File(fileName);
		// if(file.exists())
		// {
		// 	file.delete();
		// 	System.out.println(fileName+" is deleted ...");
		// }
		// else
		// {
		// 	System.out.println("NO "+fileName+"such file ...");

		// 	System.out.print("Do you want create "+fileName+" ? [y/n] : ");
		// 	String ch = br.readLine();
		// 	char c = ch.charAt(0);

		// 	if(c=='y' || c=='Y')
		// 	{
		// 		file.createNewFile();
		// 		System.out.println(fileName+" has been created...");	
		// 	}

		// }

		// System.out.println("Enter the name of Directory to Create : ");
		// String dirName = br.readLine();

		// file = new File(dirName);
		// file.mkdir();
		// System.out.println(dirName+" has been Created just :)");

		System.out.println("\n-----------------------------------\n");

		System.out.print("Enter the directory name : ");
		String dir = br.readLine();

		file = new File(dir);
		if(file.exists())
		{
			String a[] = file.list();

			for(String x:a)
			{
				File f = new File(x);
				if(f.isFile())
				{
					System.out.print("FILE : ");
				}
				else
				{
					System.out.print("\t\t\t\t\t\t dir : ");
				}
				System.out.println(x);
			}
		}

	}
}