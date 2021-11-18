package sortingTechniques;

import java.util.Scanner;

public class MergeSort {
	int arr[];
	int tempArr[];
	int length;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		int inputArr[] = new int[size];

		System.out.println("Enter the elements of an array");

		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = sc.nextInt();
		}
		System.out.println("Before sort");
		for(int i=0;i<inputArr.length;i++) {
			System.out.println(inputArr[i]); 
		}
		
		MergeSort m1 = new MergeSort();
		
		m1.sort(inputArr);
		System.out.println("After Sorting");
		for(int i: inputArr) {
			System.out.println(i); 
		}

	}

	public void sort(int[] inputArr) {
		this.arr = inputArr;
		this.length = inputArr.length;
		this.tempArr = new int[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// it will sort the left side array
			divideArray(lowerIndex, middle);
			// it will sort the right side array
			divideArray(middle + 1, higherIndex);
			
			mergeArray(lowerIndex, middle, higherIndex);
			
		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		
		for (int i = lowerIndex; i <=higherIndex; i++) {
			tempArr[i] = arr[i];
		}
		
		
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			} else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle)
		{
			arr[k]= tempArr[i];
			k++;
			i++;
		}
			
	}

}
