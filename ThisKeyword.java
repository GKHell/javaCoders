class ThisKeyword
{
	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data();


		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);

		d1.display();
		d1.insert(23,45);
	}
}
class Data{

	int x,y;
	void insert(int x,int y)
	{
		this.x = x;
		this.y = y;
		x = 100;
		System.out.println("x = "+this.x+"\t y = "+this.y);
	}
	void display()
	{
		System.out.println("this : "+this);
	}
}