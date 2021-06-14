
class WrapperClassCode{
	public static void main(String[] args) {
		
		Integer a = 10;
		short c = a.shortValue();
		System.out.println("shortValue : "+c);

		////////////////////////////////////////
		// # character class

		Character ch = 's'; //s = 83
		Character ch1 = 'A';
		System.out.println("Character : "+ch);

		System.out.println(ch+" == "+ch1+"\t : "+(ch==ch1));
		System.out.println(ch+" != "+ch1+"\t : "+(ch!=ch1));

		String s = ch.toString(); // way 1
		       s = ""+ch;  // way 2
		System.out.println("string value : "+s);

		ch = Character.valueOf('C');
		System.out.println("Character : "+ch);

		ch = '3';
		System.out.println("isDigit() : "+Character.isDigit(ch));

		ch = 'l';
		System.out.println("isLetter() : "+Character.isLetter(ch));

		ch = ' ';
		System.out.println("isSpace() : "+Character.isSpace(ch));

		ch = '5';
		System.out.println("isLetterOrDigit : "+Character.isLetterOrDigit(ch));

		ch = 'i';
		System.out.println("toUpperCase : "+Character.toUpperCase(ch));

		////////////////////////////////////////////////////////
		///////// # Byte Class

		Byte b =Byte.parseByte("23");
		System.out.println("Byte : "+b);

		b = Byte.valueOf((byte)3);
		System.out.println("Byte : "+b);

		////////////////////////////////////////////////////////
		///////// # Integer Class

		Integer i = Integer.parseInt("13");

		System.out.println("Integer : "+i);

		Integer i1 = Integer.parseInt("1");
		Integer i2 = Integer.parseInt("1");

		System.out.println(i1+".compareTo("+i2+") = "+(i1.compareTo(i2))); //0,1,-1
		System.out.println(" "+i1+".equals("+i2+") = "+(i1.equals(i2))); //0,1,-1


		System.out.println(i+" in hex : "+Integer.toHexString(i));
		System.out.println(i+" in oct : "+Integer.toOctalString(i));
		System.out.println(i+" in bin : "+Integer.toBinaryString(i));


		// /*
		// 	hex = int ?
		// 	 256 16 1
		// 	 	  1	3
		// 	 	 ----
		// 	 	 16+3 = 19

		// */


		Long l = Long.parseLong("120931");

		System.out.println("Long : "+l.toString());

		Long l1 =Long.parseLong("120931");
		Long l2 =Long.parseLong("120935");

		System.out.println(" compareTo() : "+(l1.compareTo(l2)));
		System.out.println("    equals() : "+(l1.equals(l2)));
		// String s;
		// s = l.toString();   // datatype -> String
		s = l+"";
		System.out.println("toString : "+s);


		l = Long.valueOf(s); // String -> datatype
		System.out.println("valueOf : "+l);

		Float f = Float.parseFloat("2323.34");
		// f = 121.34f; //way1
		f = (float)121.34;
		System.out.println("float : "+f);
			 	 
		 //////////////// : boolean 

		Boolean bool = Boolean.parseBoolean("sdjfkbj");
		System.out.println("Boolean : "+bool); 		

		Boolean b1 = Boolean.parseBoolean("true");
		Boolean b2 = Boolean.parseBoolean("false");

		System.out.println("Status : "+b1+b2);



	}
}