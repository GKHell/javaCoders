class AccessS{
	public static void main(String[] args) {

		Data d = new Data();
			
			d.display();
	}
}
class Data{

	private String name;
	private String code;
	private float value;

	protected void display()
	{
		name = "rahu";
		code = "3657fhfW";
		value = 239.77f;	

		System.out.println(" name : "+name);
		System.out.println(" code : "+code);
		System.out.println("value : "+value);

	}
}