
import java.io.*;
class Hell{
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DataInputStream ds = new DataInputStream(System.in);

		System.out.print("Enter the file name : ");
		String fileName = br.readLine();
		FileOutputStream file = new FileOutputStream(fileName);

		BufferedOutputStream bout = new BufferedOutputStream(file,1024);

		for(char i=65;i<91;i++)
		{	

			bout.write(i);
		}

		bout.close();
	}
}