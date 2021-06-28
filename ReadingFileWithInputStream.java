
import java.io.*;
class Hell{
	public static void main(String[] args)throws Exception {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataInputStream ds = new DataInputStream(System.in);

		System.out.print("Enter file Name : ");
		String fileName = br.readLine();

		FileInputStream file = new FileInputStream(fileName);

		int ch;
		while((ch=file.read())!=-1)
		{
			System.out.print((char)ch);
		}

	}
}