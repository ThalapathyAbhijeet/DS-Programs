package searching;
import java.util.Scanner;
public class BinarySearchRecursion {
	public static int bsearch(int arr[],int key, int first,int last) {
		if(first<=last) {
		int mid=first + (last-first)/2;
		if(key==arr[mid]) {
			return mid;
		}
		if(key<arr[mid]) {
			return bsearch(arr, key, first, last=mid-1);
		}
		else
			return bsearch(arr, key, first=mid+1, last);
		}
		return -1;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[]= new int [size];
		int first =0;
		int last =size-1;
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
		int b=bsearch(arr,key,first,last);
		if(b==-1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Found");
			}
		}

}
