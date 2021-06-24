
import java.io.*;
import java.util.*;
class ArrayListWithStudent{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no of Students : ");
		int n = Integer.parseInt(br.readLine());

		ArrayList<Student> data = new ArrayList<Student>();

		int i;
		for(i=0;i<n;i++)
		{
			Student s = new Student();
			s.getData();
					data.add(s);
		}

		System.out.println("\n\n-----------------------");
		for(Student s: data)
		{
			if(s.marks >= 33)
				s.showData();
		}

	}
}

class Student{

	float marks;
	int rollno;
	String name;

	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	void getData() throws IOException
	{

			System.out.print("\nEnter the rollno : ");
			rollno = Integer.parseInt(br.readLine());

			System.out.print("        Enter name : ");
			name = br.readLine();

			System.out.print("       Enter Marks : ");
			marks = Float.parseFloat(br.readLine());

	}

	void showData()
	{
		System.out.printf(" %3d | %10s | %3.2f\n",rollno,name,marks);	
	}
}