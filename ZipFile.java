import java.io.*;
import java.util.zip.*;
// file1 -> zip -> file2
class ZipFile{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileInputStream file1 = null;
		FileOutputStream file2 = null;

		System.out.print("Enter the file Name : ");
		String fileName = br.readLine();

		try{
			file1 = new FileInputStream(fileName);
			file2 = new FileOutputStream(fileName+".zip");
		}
		catch(Exception e)
		{
			System.out.println("invalid file name......."+e);
		}

		 DeflaterOutputStream kartik = new DeflaterOutputStream(file2);

		int ch;
		while((ch=file1.read())!=-1)
		{
			kartik.write((char)ch);
		}

	file1.close();
	file2.close();
	}
}