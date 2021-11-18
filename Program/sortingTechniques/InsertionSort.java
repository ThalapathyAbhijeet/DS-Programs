package sortingTechniques;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
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
		
		System.out.println("Array ELements sorting in ascending order by Insertion sort");
		
		for(int i =1;i<arr.length;++i) {
			int key =arr[i];
			int j=i-1;
		while(j>=0 && key < arr[j]) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
		}
		
		for (int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		
		System.out.println("Array ELements sorting in descending order by Insertion sort");
		
		for(int i =1;i<arr.length;++i) {
			int key =arr[i];
			int j=i-1;
		while(j>=0 && key > arr[j]) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
		}
		
		for (int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		
		
	}

}
