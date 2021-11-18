package recursion;
import java.util.Scanner;
public class SumoFSeriesUsingRecursion {
	static int sumOfseries(int min, int max) {
		if(min>=max) {
			return min;
		}
		else	
		return min+sumOfseries(min+1,max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=1;
		System.out.println("Enter the number upto which sum of natural numbers required");
		int max = sc.nextInt();
		System.out.println(sumOfseries(min, max));
		
//		int myArr[] = new int [7];
//		System.out.print(myArr);

	}
}
