
import java.io.*;
import java.util.*;
class ObjectArray{
	public static void main(String[] args) throws Exception {
	

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of Student : ");
		int n = sc.nextInt();

		Student s[] = new Student[n];

		System.out.println("Enter the data : ");
		int  i;
		for(i=0;i<n;i++)
		{
			s[i] = new Student();	
			s[i].getData();
		}

		System.out.println("\n---------------------\n");

		// for(i=0;i<n;i++)
		// {
		// 	s[i].showData();
		// }

		for(Student me:s)
		{
			me.showData();	
		}
	}
}
class Student{

	String name;
	int rollno;
	String subject;
	float marks;

	void getData() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("\n\nEnter Name : ");
		name = br.readLine();

		System.out.print("Enter rollno : ");
		rollno = Integer.parseInt(br.readLine());

		System.out.print("Enter the subject : ");
		subject = br.readLine();

		System.out.print("Enter marks : ");
		marks = Float.parseFloat(br.readLine());
	}

	void showData()
	{
		System.out.printf("%-10s | %3d | %-10s | %3.2f\n",name,rollno,subject,marks);
	}
}