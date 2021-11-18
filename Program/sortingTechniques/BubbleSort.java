package sortingTechniques;

import java.util.Scanner;

public class BubbleSort {

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
		
		System.out.println("Bubble sorted Array in ascending order is as follows");
		int temp =arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j =1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j]) {
					temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Bubble sorted Array in descending orderis as follows");
		 temp =arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j =1;j<arr.length-i;j++)
			{
				if(arr[j-1]<arr[j]) {
					temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
