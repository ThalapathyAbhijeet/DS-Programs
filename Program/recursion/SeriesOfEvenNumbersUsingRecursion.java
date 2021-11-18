package recursion;

import java.util.Scanner;

public class SeriesOfEvenNumbersUsingRecursion {
	static int min;
	static int max;
	static void EvenSeries (int min,int max) {
		
		if(min>max) {
			return;
		}
		else {
			if(min%2==0)
				System.out.println(min);
				EvenSeries(min+1, max);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a start number");
		min = sc.nextInt();
		System.out.println("Enter a End Number");
		max=sc.nextInt();
		System.out.println("The Even Number Series from "+min+" to "+max+"is as follows :");
		EvenSeries(min, max);

	}

}
