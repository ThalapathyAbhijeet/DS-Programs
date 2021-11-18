package recursion;
import java.util.*;
public class FiboNacciSeiresUsingRecursion {
	static int sum;
	static int fibonacci (int num1,int num2, int max) {
		if(num1 ==0 || num2 ==1)
		{
			System.out.print(num1+" ");
			
		}
		if(sum>max) {
			return sum;
		}
		else {
			 sum = num1+num2;
			System.out.print(sum+" ");
			return sum+fibonacci(num1=num2, num2=sum, max);
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num =0;
		int num1=1;
		System.out.println("Enter a max number");
		int max=sc.nextInt();
		System.out.println(sum+fibonacci(num, num1, max));
		
	}

}
