package recursion;

public class SeriesOfNumbersUsingRecursion {
	
	static int series (int n) {
		if(n<=1)
			return 1;
		else {
		System.out.println(n);	
		return series(n-1);
		}
		
	}
	
		
	
	public static void main(String[] args) {
		
		System.out.println(series(10));
}

}

