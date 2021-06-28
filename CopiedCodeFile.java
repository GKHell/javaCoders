

// file 1 : input  (file1 -> program)
// file 2 : output (program -> file2)

import java.io.*;
class CopiedCodeFile{

	public static void main(String[] args)throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileInputStream file1 = null;		// file1 -> program
		FileOutputStream file2 = null;	 // program -> file2	

		System.out.print("Enter file1 name : ");
		String fileName1 = br.readLine();

		System.out.print("Enter file2 name : ");
		String fileName2= br.readLine();

		try{
			file1 = new FileInputStream(fileName1);
			file2 = new FileOutputStream(fileName2);
		}
		catch(Exception e)
		{
			System.out.println("invalid file names.....");
			System.exit(0);	
		}

		int ch;

		while((ch=file1.read())!=-1)
		{
			file2.write((char)ch);
		}

		file1.close();
		file2.close();
	}
}