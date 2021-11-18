import java.util.Scanner;

public class DoublyLinearLinkedList {
	DLNode head;

	int countNum() {
		int count = 0;
		DLNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	void printLinkedListDL() {
		System.out.println("Doubly linear Linked list elements are as follows");
		DLNode trav = head;

		while (trav != null) {
			System.out.print(" " + trav.data + " ===>");
			trav = trav.next;
		}
		System.out.println();
	}

	void addAtFirstDL() {
		DLNode new_node = new DLNode();
		if (head == null) {
			head = new_node;
		} else {
			new_node.next = head;
			head.prev = new_node;
			head = new_node;
		}
	}

	void addAtLastDL() {
		DLNode new_node = new DLNode();
		DLNode trav;
		if (head == null) {
			head = new_node;

		} else {
			trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = new_node;
			new_node.prev = trav;
		}
	}

	void addAtPosition(int pos) {
		int count = countNum();
		DLNode new_node = new DLNode();
		DLNode trav;
		if (pos >= 1 && pos <= count + 1) {
			if (pos == 1) {
				addAtFirstDL();
			}
			if (pos == count) {
				addAtLastDL();
			} else {
				trav = head;
				int i = 1;
				while (i < pos - 1) {
					i++;
					trav = trav.next;
				}
				new_node.next = trav.next;
				new_node.prev = trav;
				trav.next = new_node;
			}
		}
	}

	void deleteAtFirst() {
		if (head == null) {
			System.out.println("List is Empty");
		} else {

			if (head.next == null) {
				head = null;
			} else {

				head = head.next;
				head.prev = null;

			}
		}
	}

	void deleteAtLast() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			if (head.next == null) {
				head = null;
			} else {
				DLNode trav = head;
				while (trav.next.next != null) {
					trav = trav.next;
				}
				trav.next = null;
			}
		}
	}

	void deleteAtPosition(int pos) {
		int count = countNum();
		DLNode trav;
		if (pos >= 1 && pos <= count) {
			if (pos == 1) {
				deleteAtFirst();
			}
			if (pos == count) {
				deleteAtLast();
			} else {
				trav = head;
				int i = 1;
				while (i < pos - 1) {
					i++;
					trav = trav.next;
				}
				trav.next = trav.next.next;
				
				trav.next.prev = trav;
			}

		}

	}

	public static void main(String[] args) {
		DoublyLinearLinkedList DL1 = new DoublyLinearLinkedList();
		DL1.addAtFirstDL();
		DL1.addAtFirstDL();
		DL1.addAtFirstDL();
		DL1.addAtFirstDL();
		DL1.printLinkedListDL();
		DL1.addAtLastDL();
		DL1.addAtLastDL();

		DL1.printLinkedListDL();
		DL1.addAtPosition(2);
		DL1.printLinkedListDL();
		DL1.deleteAtFirst();
		DL1.printLinkedListDL();
		DL1.deleteAtLast();
		DL1.printLinkedListDL();
		DL1.deleteAtPosition(3);
		DL1.printLinkedListDL();

	}
}

class DLNode {

	int data;
	DLNode prev;
	DLNode next;

	DLNode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to insert in node");
		data = sc.nextInt();
		prev = null;
		next = null;
	}
}