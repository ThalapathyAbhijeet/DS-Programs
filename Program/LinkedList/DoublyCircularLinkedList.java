import java.util.Scanner;

public class DoublyCircularLinkedList {
	DCNode head;

	int countNumb() {
		int count = 0;
		DCNode trav = head;
		do {
			count++;
			trav = trav.next;
		} while (trav != head);
		return count;
	}

	void printDClinkedList() {
		System.out.println("Doubly circular Linked List Elements are");
		DCNode trav = head;
		DCNode rev = null;
		if (head != null) {
			do {
				System.out.print(" " + trav.data + " ==>");
				// rev= trav;
				trav = trav.next;

			} while (trav != head);
			System.out.println();
			/*
			 * do{ System.out.println(rev.data); rev=rev.prev; }while(rev!=head);
			 */
		}
	}

	void addAtFirstDC() {
		DCNode new_node = new DCNode();
		if (head == null) {
			head = new_node;
			head.next = new_node;
			head.prev = new_node;
		} else {

			new_node.next = head;
			new_node.prev = head.prev;
			head.prev.next = new_node;
			head = new_node;

		}
	}

	void addAtPosition(int pos) {
		int count = countNumb();
		DCNode new_node = new DCNode();
		if (pos >= 1 && pos <= count + 1) {
			if (pos == 1) {
				addAtFirstDC();
			}
			if (pos == count + 1) {
				addLastDC();
			} else {
				int i = 1;
				DCNode trav = head;
				while (i < pos - 1) {
					i++;
					trav = trav.next;
				}

				new_node.next = trav.next;
				new_node.prev = trav;
				trav.next = new_node;
				trav.next.prev = new_node;
			}
		}

	}

	void addLastDC() {
		DCNode new_node = new DCNode();
		DCNode trav;
		if (head == null) {
			head = new_node;
			new_node.prev = head;
			new_node.next = head;
		} else {

			new_node.next = head;
			new_node.prev = head.prev;
			head.prev.next = new_node;
			head.prev = new_node;

		}
	}

	void deleteAtFirstDC() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			if (head.next == head) {
				head.next = null;
				head.prev = null;
			} else {
				head.next.prev = head.prev;
				head.prev.next = head.next;
				head = head.next;

			}
		}
	}

	void deleteAtLast() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			if (head.next == head) {
				head.next = null;
				head.prev = null;
			} else {

				head.prev.prev.next = head;
				head.prev = head.prev.prev;
			}
		}
	}

	void deleteAtPosition(int pos) {
		int count = countNumb();
		if (pos >= 1 && pos <= count + 1) {
			if (head == null) {
				System.out.println("List is empty");
			}

			else {
				DCNode trav;
				if (pos == 1) {
					deleteAtFirstDC();
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
	}

	public static void main(String[] args) {
		DoublyCircularLinkedList DC1 = new DoublyCircularLinkedList();
		DC1.addAtFirstDC();
		DC1.addAtFirstDC();
		DC1.addAtFirstDC();
		DC1.addAtFirstDC();
		DC1.printDClinkedList();
		DC1.addLastDC();
		DC1.addLastDC();
		DC1.addLastDC();
		DC1.addLastDC();
		DC1.printDClinkedList();
		// System.out.println(DC1.countNumb());
		DC1.addAtPosition(5);
		DC1.printDClinkedList();

		DC1.deleteAtFirstDC();
		DC1.printDClinkedList();

		DC1.deleteAtLast();
		DC1.printDClinkedList();

		DC1.deleteAtPosition(5);
		DC1.printDClinkedList();
	}

}

class DCNode {

	int data;
	DCNode prev;
	DCNode next;

	public DCNode() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the element to insert into linked list");
		data = Sc.nextInt();
		prev = null;
		next = null;
	}

}