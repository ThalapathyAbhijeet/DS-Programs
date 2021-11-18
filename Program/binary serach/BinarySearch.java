package searching;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[]= new int [size];
		int left =0;
		int right =size-1;
		int mid;
		int key;
		System.out.println("Enter the array Elements ");
		for(int i =0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("array Elements are");
		for(int j : arr) {
			System.out.println(j);
		}
		System.out.println("Enter the key");
		key=sc.nextInt();
		boolean b = false;
		while (left<=right) {
			
			mid=(left+right)/2;
			
			if(key ==arr[mid])
			{
				b=true;
			}
			if(key<arr[mid])
			{
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		if(b==true) {
			System.out.println("Key element is present in array");
		}
		else {
			System.out.println("Key element is not present in array");
		}
	}

}
