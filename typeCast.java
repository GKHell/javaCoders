
class typeCast{
	public static void main(String[] args) {

	 // lower to higher  //implicit  //widening

		int i = 40;
		float f = i;

		System.out.println("f : "+f);


   // higher to lower // explicit // narrowing

		float x = 30.5f;
		int y = (int)x;
		System.out.println("y : "+y);

	}
}