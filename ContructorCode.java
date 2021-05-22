class ContructorCode
{
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.show();
		d1.show();
		d1.show();
		d1.show();
		Data d2 = new Data("coder");
		Data d3 = new Data("root","me");
	}
}

class Data{

	String user;
	Data()//default
	{
		user = "root";
		System.out.println(this+"\tnew login 1....."+user);
	}
	Data(String newUser) //parameterized 
	{
		user = newUser;
		System.out.println(this+"\tnew login 2....."+user);
	}
	Data(String newUser,String name) //parameterized 
	{
		user = newUser+"_"+name; //
		System.out.println(this+"\tnew login 3....."+user);
	}
	void show()
	{
		System.out.println(this+"\t---------------------------");
	}
}