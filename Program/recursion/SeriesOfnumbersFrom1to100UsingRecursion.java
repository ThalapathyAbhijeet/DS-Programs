package recursion;

public class SeriesOfnumbersFrom1to100UsingRecursion {

	static int fwdSeries(int i) {
		if(i>=100) {
			return 100;
		}
		else {
			System.out.println(i);
			return fwdSeries(i+1);
		}
	}
	public static void main(String[] args) {
		
		System.out.println(fwdSeries(1));

	}

}
