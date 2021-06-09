
// import AllCodes.PrimeCode;
// import AllCodes.PallomCode;
import AllCodes.*;
class AllCaseTest{
	public static void main(String[] args) {
		
		PrimeCode p = new PrimeCode();

		System.out.println("status : "+p.isPrime(7));
		System.out.println("status : "+p.isPrime(9));
		p.printPrimes(100,200);

		///////////////////////

		PallomCode pc = new PallomCode();
		System.out.println("PallomCode : "+pc.isPallom(123));
		System.out.println("PallomCode : "+pc.isPallom(121));


	}
}