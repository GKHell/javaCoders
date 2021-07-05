
import java.util.*;
import java.io.*;
class FileProperties{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the file name : ");
		String fileName = br.readLine();


		FileInputStream file = null;

		try{

			file = new FileInputStream(fileName);
		}
		catch(Exception e)
		{
			System.out.println(fileName+" no Such file avaiable...");
			System.exit(0);
		}

		int ch;
		int character = 0;
		int words = 0;
		int line = 0;
		while((ch=file.read())!=-1)
		{
			char s = (char)ch;
			System.out.print(s);

			if(ch!=' ' && ch!='\n')
				character++;

			if(ch==' ' || ch=='\n')
				words++;

			if(ch=='\n')
				line++;
		}

		System.out.println("character : "+character);
		System.out.println("    words : "+words);
		System.out.println("    line : "+line);

		file.close();
	}
}