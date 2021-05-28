
class superKeyWord{
	public static void main(String[] args) {
		
		Student s = new Student("Ghwsd",12,"Python",2304.53);
		s.display();
	}
}

class Books{

	String name;
	double price;
 
 		public Books(String name ,double price)
 		{
 			 
			this.name = name;
			this.price = price;
 		}
		void display()
		{
			System.out.println("Book Name "+name+"\t price : "+price);
		}
}
class Student extends Books{

	String name;
	int rollno;
		public Student(String name,int rollno,String bName,double price)
		{
			super(bName,price);

			this.name = name;
			this.rollno = rollno;
		}	
		void display()
		{
			System.out.println("name : "+name+"\t rollno : "+rollno);
			super.display();
		}
}