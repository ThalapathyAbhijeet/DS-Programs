package recursion;
import java.util.*;
public class PalindromeUsingRecursion {
	static int num;
	
	static int palindrome(int num, int temp) {
		if(num==0)
			return temp;
		temp = (temp*10)+(num%10);
			return palindrome(num/10,temp);
	}
	
	// rem = num%10
	// sum =( sum *10)+rem
	// num /10
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num = sc.nextInt();
		System.out.println("Number after reversal");
		int rev = palindrome(num,0);
		System.out.println(rev);
		if(num==rev) {
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Is not a palindrome");
		}
	}

}
