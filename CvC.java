class PolyMorphismCode{
	public static void main(String[] args) {

	char ch = 'a';

	int i = ch; //coersion {lower -> HIgher}
	System.out.println("i : "+i);	

	//--------------------------------------------------
	float f = 23.9f;
	int n = (int)f; // conversion {higher -> lower}

	System.out.println("n : "+n);

	}
}