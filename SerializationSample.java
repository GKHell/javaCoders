
import java.io.*;
import java.util.*;
class SerializationSample
{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no of Students : ");
		int n = Integer.parseInt(br.readLine());

		Student s[] = new Student[n];

		/////
				FileOutputStream file = new FileOutputStream("StudentObject.txt");
				ObjectOutputStream ankita = new ObjectOutputStream(file);
		/////
		System.out.print("Enter the data : \n");
		for(int i=0;i<n;i++)
		{
			s[i] = new Student();
			System.out.println("\nEnter data for student "+(i+1)+" : ");
			s[i].setData();
			ankita.writeObject(s[i]);
		}

		file.close();

	}
}

class Student{

	int rollno;
	String name;
	String subject;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void setData() throws Exception
	{
		System.out.print("Enter the rollno : ");
		rollno = Integer.parseInt(br.readLine());

		System.out.print("Enter the name : "); 
		name = br.readLine();

		System.out.print("Enter subejct : ");
		subject = br.readLine();

	}
	void showData(){
		System.out.printf("%3d\t%10s\t%5s\n",rollno,name,subject);		
	}
}