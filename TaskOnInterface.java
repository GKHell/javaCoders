
class TaskOnInterface{
	public static void main(String[] args) {
		
		Illusion c = new Illusion();
		c.show();
	}
}
interface Code{

	int n = 30;
	public void show();
}

class Illusion implements Code{

	public void show()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || j%2==0 && i%2==0)
					System.out.printf(" * ");
				else
					System.out.printf(" | ");

			}
		System.out.printf("\n");

		}
	}
}