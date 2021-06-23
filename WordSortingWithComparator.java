

import java.util.*;
import java.io.*;
class WordSortingWithComparator{
	public static void main(String[] args)throws IOException {
		int i;
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the no words : ");
		int n = sc.nextInt(); // scanner

		String word[] = new String[n];
		System.out.println("Enter those words ... : ");
		for(i=0;i<n;i++)
		{
			System.out.print("word [ "+i+" ] = ");
			word[i] = br.readLine(); //BufferedReader
		}


		Arrays.sort(word,new Ascending());

		System.out.println("\n\n---------------------- \n");
		for(i=0;i<n;i++)
		{
			System.out.println("word [ "+i+" ] = "+word[i]);
		}

	}
}

class Ascending implements Comparator<String>{


	public int compare(String i1,String i2)
	{
		return i1.compareTo(i2);
		// return -1;
		/*
				 i1==i2 returns 0
				i1 > i2 returns 1
				i1 < i2 returns -1

		*/
	}
}


