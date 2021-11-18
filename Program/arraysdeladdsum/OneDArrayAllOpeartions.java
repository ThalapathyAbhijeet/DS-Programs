package arrays;
import java.util.*;
public class OneDArrayAllOpeartions {
	int size; 
	int key; 
	int i;
	int location;
	static int arr[];
	Scanner sc = new Scanner(System.in);

	public void ArrayElements() {
		
		System.out.println("Enter the Size of n array");
		size = sc.nextInt();
		
		arr= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Entered Array Elements are");
		for(int j: arr) {
			System.out.println(j);
		}
		
	}
	
	public void insertElementInArray()
	{	
		System.out.println("Enter the location to which insert an new element");
		location = sc.nextInt();
		System.out.println("enter the element for replacement");
		key =sc.nextInt();
		
		for(i=0;i<arr.length;i++)
		{
			if(location==i) {
				  arr[i]= key;
			}
		}
		
		System.out.println("Elements After Inserting Elements");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public void deleteArrayElement() {
		System.out.println("Enter the element that delete from array");
		key =sc.nextInt();
		for(i=0;i<arr.length;i++) {
		if (arr[i]==key)
			break;
		}
		size--;
		for(int k=i;k<size;k++)
		{
			arr[k]=arr[k+1];
		}
		
		System.out.println("Array Elements after delete are");
		
		for(i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void searchArrayElement() {
		System.out.println("Enter an element to Search  from array");
		key =sc.nextInt();
		boolean b = false;
		for(i=0;i<size;i++) {
			
			if(arr[i]==key) {
			 b=true;
			}
		
		}
		if(b==true)
		System.out.println("KEY Element "+key+" is found and it is at index "+i);
		else
			System.out.println("KEY Element "+key+" is not found ");	
				
	}
	
	public void sumOfArrayElements() {
		int sum=0;
		for(i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println("the sum of all Array Elements is "+sum);
	}
	
	public void arrayElementsReversal() {
		
		System.out.println("Elements of array in reverse order as ");
		for(i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public void mergeTwoArrays() {
		
		System.out.println("Enter the second array size");
		int size1 = sc.nextInt();
		int c= size+size1;
		int brr[]= new int[size1];
		System.out.println("Enter the second array ");
		for( i=0;i<size1;i++) {
				brr [i]=sc.nextInt();
		}
		System.out.println("Entered array are");
		for(int j: brr) {
			System.out.println(j);
		}
		int Crr[]= new int[size+size1];
		   for (int i = 0; i < size; i = i + 1) {
	         
	            Crr[i] = arr[i];
	        }
	 
	        for (int i = 0; i < size1; i = i + 1) {
	  
	            Crr[size + i] = brr[i];
	        }
	        System.out.println("Merged arrays are:");
	        for (int i = 0; i < c; i = i + 1) {
		         
	            System.out.println(Crr[i]);
	        }
	        
		
	}
	

	public static void main(String[] args) {
		
		OneDArrayAllOpeartions O1 = new OneDArrayAllOpeartions();
		O1.ArrayElements();
		O1.insertElementInArray();
		O1.deleteArrayElement();
		O1.searchArrayElement();
		O1.sumOfArrayElements();
		O1.arrayElementsReversal();
		O1.mergeTwoArrays();
		

	}

}
