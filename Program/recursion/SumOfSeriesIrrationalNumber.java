package recursion;
import java.util.*;
import java.util.Scanner;

public class SumOfSeriesIrrationalNumber {
	static double sum;
	static double sumOfSeries(int i, int n) {
		if(i>n) {
			return sum;
		}
		else {	
		if(n%2==0)
			sum=sum-(1.0/n);
		else
			sum=sum+(1.0/n);
		return sumOfSeries(i,n-1);	
		}		
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num =sc.nextInt();
			double d =sumOfSeries(1,num);
			System.out.println("Sum of the series upto "+num);
			System.out.println(d);
	}
}
