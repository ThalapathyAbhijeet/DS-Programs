package queueLec;

import java.util.Scanner;

public class QueueDemo {
	static int size;
	static int Q[];
	static int front;
	static int rear ;
	public QueueDemo(int size) {
		front=-1;
		rear=-1;
		Q=new int [size];
	}
	boolean isempty() {
		
		if(front ==-1 || front>rear)
			return true;
		else
			return false;
	}
	
	boolean isFull() {
		if(front==0 && rear==size-1) 
			return true;
		else
			return false;
	}
	
	void enQueue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to add");
		int x= sc.nextInt();
		if(isFull()) {
			System.out.println("Queue is full");
		}
		
		else {
			if(front ==-1) {
				front =0;
			}
				rear++;
				
				Q[rear]=x;
				System.out.println(x+"Inserted");
			}
		}
	
	
	int deQueue() {
		int x;
		if(isempty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		
		else
		{
			x=Q[front];
			if(front >=rear)
			{
				front = -1;
				rear =-1;
			}
			else {
			front =front+1;
			
			}
			
			System.out.println(x+"Deletion completed");
			return x;
		}
	}
	void display () {
		System.out.println("Elements from queue is");
		for(int i=front;i<=rear;i++) {
			if(isempty())
			{
				System.out.println("List is empty");
			}
			else
			System.out.println(Q[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of QUEUE");
		size=sc.nextInt();
		QueueDemo Q1= new QueueDemo(size);
		Q1.enQueue();
		Q1.enQueue();
		Q1.enQueue();
		Q1.enQueue();
		Q1.enQueue();
		Q1.display();
		Q1.deQueue();
		Q1.deQueue();
		Q1.deQueue();
		Q1.deQueue();
		Q1.deQueue();
		Q1.deQueue();
		Q1.display();
		
		

	}

}
