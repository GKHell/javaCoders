class SwapCode
{
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();

		d1.x = 100;
		d2.x = 200;

			System.out.println("d1.x : "+d1.x+"\t d2.x : "+d2.x);	
			d2.swap(d1);
			System.out.println("d1.x : "+d1.x+"\t d2.x : "+d2.x);	

	}
}
class Data{
	int x;
	void swap(Data obj)
	{
		this.x = this.x+obj.x;
		obj.x = this.x - obj.x;
		this.x = this.x-obj.x;
	}
}