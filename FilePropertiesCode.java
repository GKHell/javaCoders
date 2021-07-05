
import java.util.*;
import java.io.*;
class FileProperties{
	public static void main(String[] args)throws IOException {
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		File file = new File("code.cpp");	

		System.out.println("     isFile : "+file.isFile());
	 	System.out.println("isDirectory : "+file.isDirectory());
	 	System.out.println("    canRead : "+file.canRead());
		
	}
}