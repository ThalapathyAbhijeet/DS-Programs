package binaryTrees;

import java.util.Scanner;

public class BinarySearchTreeImplementation {
	BStreeNode root;
	
	static class BStreeNode{
		
		int data;
		BStreeNode left;
		BStreeNode right;
		
		BStreeNode(){
			System.out.println("Enter the values to Binary Search Tree");
			Scanner sc = new Scanner(System.in);
			data=sc.nextInt();
		}
		
	}
	
	

	
	
// Insert an element into Binary Search tree
// check root == null  if null then insert node
// then check the value if that is greater than root value then assign it to right side
//// then check the value if that is less than root value then assign it to left side 	
	
	
	BStreeNode insert(BStreeNode root) {
		
		if(root==null) {
			root= new BStreeNode();
			return root;
		}
		else {
			BStreeNode b1 = new BStreeNode();
			int value= b1.data;
			if(value>root.data)
			{
				root.left=insert(root.left);
			}
			else {
				root.right=insert(root.right);
			}
			
		}
		return root;
	}
	

	
	void inOrderBST(BStreeNode root) {
		if(root==null) {
			System.out.println("Null root");
			return;
		}
		inOrderBST(root.left);
		System.out.print(root.data+"-->");
		inOrderBST(root.right);
	}
	
	public static void main(String[] args) {
		BinarySearchTreeImplementation b1 = new BinarySearchTreeImplementation();
		BStreeNode root = new BStreeNode();
		b1.root=b1.insert(b1.root);
		b1.root=b1.insert(b1.root);
		b1.root=b1.insert(b1.root);
		b1.root=b1.insert(b1.root);
		b1.root=b1.insert(b1.root);
		
		b1.inOrderBST(b1.root);
		

	}

	
}

