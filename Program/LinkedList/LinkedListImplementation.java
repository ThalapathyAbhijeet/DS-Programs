import java.util.Scanner;

//-------------class node---------------------//
class Node {
	int data;
	Node next;

	Node() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to insert in node");
		data = sc.nextInt();
		next = null;
	}
}

//------------------class LinkedList--------------------//
public class LinkedListImplementation {
	Node head;

	int countEle() {
		Node temp = head;
		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	void printLinkedList() {
		System.out.println("LinkedList Elements are");
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	void insertAtBegining() {

		Node new_node = new Node();
		if (head == null) {
			head = new_node;
		} else {
			new_node.next = head;
			head = new_node;
		}
	}

	void insertAtEnd() {

		Node new_node = new Node();
		if (head == null) {
			head = new_node;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = new_node;
		}
	}

	void insertInBetween(int pos) {
		int count = countEle();
		System.out.println(count);
		Node new_node = new Node();

		if (pos >= 1 && pos <= count + 1) {

			if (pos == 1) {
				insertAtBegining();
			} else if (pos == count + 1) {
				insertAtEnd();
			} else {
				Node trav = head;
				int i = 1;
				while (i < pos - 1) {
					i++;
					trav = trav.next;
				}
				new_node.next = trav.next;
				trav.next = new_node;
			}
		}
	}

	void deleteAtFirst() {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {

			if (head.next == null) {
				head = null;
			} else {

				head = head.next;

			}
		}
	}

	void deleteAtLast() {
		Node Trav;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			if (head.next == null)
				head = null;
			else {
				Trav = head;

				while (Trav.next.next != null) {
					Trav = Trav.next;
				}
				Trav.next = null;
			}
		}
	}

	void deleteAtInBetween(int pos) {
		int count = countEle();

		if (pos > 0 && pos <= count) {
			if (pos == 1) {
				deleteAtFirst();
			} else if (pos == count) {
				deleteAtLast();
			} else {
				Node trav = head;

				int i = 1;
				while (i < pos - 1) {
					i++;
					trav = trav.next;
				}

				trav.next = trav.next.next;
			}
		}
	}

	public static void main(String[] args) {
		LinkedListImplementation L1 = new LinkedListImplementation();
		Node first = new Node();
		Node second = new Node();
		Node Third = new Node();
		Node four = new Node();
		L1.head = first;
		L1.head.next = second;
		second.next = Third;
		Third.next = four;
		L1.printLinkedList();
		L1.insertAtBegining();
		L1.printLinkedList();
		L1.insertAtEnd();
		L1.printLinkedList();
		L1.insertInBetween(4);
		L1.printLinkedList();
		L1.deleteAtFirst();
		L1.printLinkedList();
		L1.deleteAtLast();
		L1.printLinkedList();
		L1.deleteAtInBetween(1);
		L1.printLinkedList();
	}
}