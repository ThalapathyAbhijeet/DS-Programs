package recursion;

import java.util.Scanner;

public class SeriesOfOddNumberUsingRecursion {
	static int min;
	static int max;
	static void oddSeries(int min, int max) {
			
		if(min>max) {
			return;
		}
		else
		{
			if(min %2!=0)
				System.out.println(min);
				oddSeries(min+1, max);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Minimum Value ");
		min = sc.nextInt();
		System.out.println("Enter the Maximum value");
		max=sc.nextInt();
		System.out.println("Series of odd numbers from "+min+" to "+max+" are as follows");
		oddSeries(min, max);
	}

}
