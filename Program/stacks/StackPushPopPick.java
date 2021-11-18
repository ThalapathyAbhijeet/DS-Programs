package stacks;

import java.util.Scanner;

public class StackPushPopPick {
	
	static int top ;
	static int size;
	static Scanner sc = new Scanner(System.in);
	
	int arr [];
	
	boolean isEmpty()
	{
		return (top==-1);
	}
	
	boolean isFull() {
		return (top>=size);
	}
	
	
	 void  push () {
		if(top>=size-1)
		{
			System.out.println("Overflow");
			//return false;
		}
		else
		{
			System.out.println("Enter the element to push");
			top++;
			arr[top]=sc.nextInt();
			// arr[++top] = sc.nextInt();
			System.out.println("Push");
			//return true;
		}
	}
	 
	 void pop() {
		if(top==-1)
	 {
		 System.out.println("Stack is underflow");
	 }
		else
		{	int x = arr[top];
			top--;
			System.out.println("Item Popped "+x);
		}
		
	 }
	 
	 void display() {
		 if(top==-1) {
			 System.out.println("Stack is empty");
		 }
		 for(int i =0;i<=top;i++)
		 {
			
			 System.out.println(arr[i]);
		 }
	 }
	 
	 void pick() {
		 if(top==-1) {
			 System.out.println("Stack is empty");
		 }
		 else
		 {
			 System.out.println("Item Picked "+arr[top]);
		 }
		 
		 
		 
	 }
	
	public static void main(String[] args) {
		
	StackPushPopPick s1 = new StackPushPopPick();
	System.out.println("Size of an stack");
		size = sc.nextInt();
		top=-1;
		s1.arr= new int [size];
		s1.push();
		s1.push();
		s1.push();
		s1.push();
		s1.push();
		s1.push();
		System.out.println();
		s1.display();
		System.out.println();
		s1.pick();
		s1.pick();
		s1.pick();
		s1.pick();
		s1.pick();
		
		s1.display();
		System.out.println();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		System.out.println();
		s1.display();
		System.out.println();
		s1.pick();

	}

}
