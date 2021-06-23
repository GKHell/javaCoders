
import java.util.*;
class StringTokenizerSample{
	public static void main(String[] args) {
		
		String s = "I hate programming bcz its just an illusion of eyes.";

		s = "12x345y6789z0";
		StringTokenizer data = new StringTokenizer(s,"xyz");


		System.out.println("number of Tokens : "+data.countTokens());
		while(data.hasMoreTokens())
		{
			System.out.println("=> "+data.nextToken());
		}
	}
}