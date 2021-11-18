package recursion;
import java.util.*;
public class FactorialUsingRecursion {
	static int num;
	static int factorial (int n) {
		if(n<=1)
		{
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		System.out.println("Facotial of the "+num);
		System.out.println(factorial(num));
	}

}
