
class MultipleInterface
{
	public static void main(String[] args) {

		C c = new C();
		c.m1();
		c.m2();		

	}
}
// A->C,
// B->C
interface A{

	public void m1();

}
interface B{
	public void m2();
}
class C implements A, B{

	public void m1(){
		System.out.println("Hello THERE...");
	}
	public void m2(){
		System.out.println("Bye HERE...");
	}
}