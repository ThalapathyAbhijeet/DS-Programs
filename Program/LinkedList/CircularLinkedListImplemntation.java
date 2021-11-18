import java.util.Scanner;

public class CircularLinkedListImplemntation {
	CNode head;

	int countNumber() {
		int count = 0;
		CNode Trav = head;

		do {
			count++;
			Trav = Trav.next;

		} while (Trav != head);

		return count;
	}

	void addAtFirst() {
		CNode new_node = new CNode();
		if (head == null) {
			head = new_node;
			head.next = new_node;
		}

		else {
			CNode trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			new_node.next = head;
			head = new_node;
			trav.next = new_node;
		}
	}

	void addAtLast() {
		CNode new_node = new CNode();
		CNode trav = head;
		if (head == null) {
			head = new_node;
			new_node.next = head;
		} else {
			trav = head;
			do {
				trav = trav.next;
			} while (trav.next != head);
		}
		trav.next = new_node;
		new_node.next = head;

	}

	void addInBetween(int pos) {
		int count = countNumber();
		CNode trav = head;
		CNode new_node = new CNode();
		if (pos >= 1 && pos <= count + 1) {
			if (pos == 1) {
				addAtFirst();
			}
			if (pos == count + 1) {
				addAtLast();
			} else {
				int i = 1;
				do {
					i++;
					trav = trav.next;
				} while (i < pos - 1);
				new_node.next = trav.next;
				trav.next = new_node;
			}
		}

	}

	void deleteAtFirst() {
		CNode trav = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			if (head.next == head) {
				head = null;
			} else {
				do {
					trav = trav.next;
				} while (trav.next != head);

				trav.next = head.next;
				head = head.next;
			}

		}
	}

	void deleteAtLast() {
		CNode trav = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			if (head.next == head) {
				head = null;
			} else {
				do {
					trav = trav.next;
				} while (trav.next.next != head);

				trav.next = head;
			}
		}
	}

	void deleteAtPosition(int pos) {
		int count = countNumber();
		CNode trav = head;
		if (pos >= 1 && pos <= count) {
			if (pos == 1) {
				deleteAtFirst();
			}
			if (pos == count) {
				deleteAtLast();
			} else {
				int i = 1;
				do {
					i++;
					trav = trav.next;
				} while (i < pos - 1);

				trav.next = trav.next.next;

			}
		}

	}

	void printCircularLists() {
		System.out.println("Circular linked list are as follows :");
		CNode temp = head;
		if (head != null) {

			do {
				System.out.print(" " + temp.data + " ===>");
				temp = temp.next;
			} while (temp != head);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CircularLinkedListImplemntation C1 = new CircularLinkedListImplemntation();
		C1.addAtFirst();
		C1.addAtFirst();
		C1.addAtFirst();
		C1.printCircularLists();
		C1.addAtLast();
		C1.addAtLast();
		C1.addAtLast();
		C1.printCircularLists();
		C1.addInBetween(5);
		C1.printCircularLists();
		C1.deleteAtFirst();
		C1.printCircularLists();
		C1.deleteAtLast();
		C1.printCircularLists();
		C1.deleteAtPosition(4);
		C1.printCircularLists();
	}

}

class CNode {

	int data;
	CNode next;

	CNode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to insert in node");
		data = sc.nextInt();
		next = null;
	}

}