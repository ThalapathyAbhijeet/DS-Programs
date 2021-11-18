package recursion;
import java.util.*;
public class MultiPlicationtableUsingrecursion {
	static int mul;
	static int multable(int num, int i) {
		
		if(i>10)
		{
			return mul;
		}
		 mul = num*i;
		System.out.println(num+" * "+i+" = "+mul);
		return multable(num, i+1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for which calculate Multiplication table");
		int num = sc.nextInt();
		System.out.println("Multiplication table for "+num);
		multable(num, 1);

	}

}
