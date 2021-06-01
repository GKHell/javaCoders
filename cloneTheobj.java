class cloneTheobj{
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Code c1 = new Code();

		Code c2 = (Code)c1.me();

		System.out.println("c1 : "+c1.i);
		System.out.println("c2 : "+c2.i);

	}
}
class Code implements Cloneable{
	
	int i = 300;

	protected Object me() throws CloneNotSupportedException
	{
		return super.clone();
	}

}