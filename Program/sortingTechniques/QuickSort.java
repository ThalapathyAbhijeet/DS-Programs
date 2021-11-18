package sortingTechniques;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");
		size=sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the elements of an array");
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
	}

}
