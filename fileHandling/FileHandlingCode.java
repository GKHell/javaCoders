import java.io.*;
class FileHandlingCode{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the file name : ");
		String filename = br.readLine();

		FileOutputStream file = new FileOutputStream(filename);
		DataInputStream ds = new DataInputStream(System.in);

		System.out.print("Enter a data : ");
		char ch='\0';
		int i = 0;
		while(i!=3)
		{
			ch = (char)ds.read();
			if(ch=='`')
			{
				i++;
				continue;
			}
			else
				i=0;
			file.write(ch);

		}
		file.close();

	}
}