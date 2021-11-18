package binaryTrees;

import java.util.*;

// -------------------- Main Binary Tree implementation Class---------------------//
public class BinaryTreeImplementation {
	TreeNode root;

	// ---------- PreOrder Using Rceursion---------------------/
	// visit the root node
	// traverse left subtree
	// traverse right subtree
	// visit Left Right
	void preOrderBTRecursive(TreeNode root) {

		if (root == null) {
			// base case
			return;
		}

		System.out.print(root.data + "--->");
		preOrderBTRecursive(root.left);
		preOrderBTRecursive(root.right);

	}

	// ---------------Using Iterative PreOrder --------------//

	void preorderBTIterative() {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		// visit and push to stack
		while (!stack.isEmpty()) {

			TreeNode temp = stack.pop();
			// popped from stack
			System.out.print(temp.data + "--->");
			// prints data

			if (temp.right != null) {
				stack.push(temp.right);
				// visits right and push into stack
			}

			if (temp.left != null) {
				stack.push(temp.left);
				// visits left and push into stack
			}

		}

	}

//------------ recursive In order Binary traversal ------------//
// traverse left subtree
// visit the root
// traverse the right subtree
// Left Visit Right

	void inOrderBTRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrderBTRecursive(root.left);
		System.out.print(root.data + "--->");
		inOrderBTRecursive(root.right);
	}

//----------------------- Iterative In Order Traversal --------------------//	

	void inOrderBTIterative() {

		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = root;
		while (!stack.isEmpty() || temp != null) {
			if (temp != null) {
				stack.push(temp);
				// push to stack and visit left
				temp = temp.left;
				// visit left
			} else {
				temp = stack.pop();
				// pop element from stack and visit right
				System.out.print(temp.data + "--->");
				// print data from popped element
				temp = temp.right;
				// visit right
			}
		}

	}

	// -----------------------Recursive Post Order Traversal Binary Tree
	// --------------------------------//
	// Traverse left subtree
	// traverse right subtree
	// visit Node

	void postOrderBTRecursive(TreeNode root) {

		if (root == null) {
			return;
		}

		postOrderBTRecursive(root.left);
		postOrderBTRecursive(root.right);
		System.out.print(root.data + "--->");

	}

	// -------------- Iterative Post order Traversal Of Binary Treee
	// ------------------//

	void postOrderBTIterative() {
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();

		while (current != null || stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;

				if (temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + "--->");

					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + "--->");
					}

				} else {
					current = temp;
				}

			}

		}

	}

	//------------- Level Traversal technique in Binary tree--------------------//
	
	void levelTraversalBT() {
		
		if(root==null) {
			return;
		}
		
		Queue <TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty())
		{
			TreeNode temp = queue.poll();
			System.out.print(temp.data+"--->");
			
			if(temp.left!=null)
			{
				queue.offer(temp.left);
			}
			
			if(temp.right!=null)
			{
				queue.offer(temp.right);
			}
		}	
	}
	
	
	// ------------ Maximum value in Binary tree ---------------------//
	
	int maxValueInBT(TreeNode root) {
		if(root == null) {
			return 0;
		}
		else
		{
			int result = root.data;
			int left = maxValueInBT(root.left);
			int right = maxValueInBT(root.right);
			if(right>result)
			{
				result =right;
			}
			if(left > result)
			{
				result = left;
			}
			return result;
			
					
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		BinaryTreeImplementation B1 = new BinaryTreeImplementation();
		TreeNode T1 = new TreeNode();
		TreeNode T2 = new TreeNode();
		TreeNode T3 = new TreeNode();
		TreeNode T4 = new TreeNode();
		TreeNode T5 = new TreeNode();

		B1.root = T1; // root ----> first
		T1.left = T2;
		T1.right = T3;// T2<----- T1 ----> T3

		T2.left = T4;
		T2.right = T5;

		System.out.println("PreOrder Traversal of Binary tree using recursion are :");
		B1.preOrderBTRecursive(B1.root);
		System.out.println();
		System.out.println("Preorder traversalof binary tree using iteration are :");
		B1.preorderBTIterative();
		System.out.println();
		System.out.println("Inorder traversal of binary tree using recursion are :");
		B1.inOrderBTRecursive(B1.root);
		System.out.println();
		System.out.println("Inorder traversal of binary tree using Iteraion are :");
		B1.inOrderBTIterative();
		System.out.println();
		System.out.println("PostOrder Traversal of Binary tree using recursion are :");
		B1.postOrderBTRecursive(B1.root);
		System.out.println();
		System.out.println("Level order Traversal of Binary Tree are");
		B1.levelTraversalBT();
		System.out.println();
		System.out.println("maximum value from Binary Tree is");
		System.out.println(B1.maxValueInBT(B1.root));
		
		
	}

}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
		System.out.println("Enter the data to which add into tree");
		Scanner sc = new Scanner(System.in);
		this.data = sc.nextInt();
		left = right = null;

	}
}