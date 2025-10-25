


import java.util.LinkedList;

public class LinkListUse {
	public static Node<Integer> createLinkList() {
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		Node<Integer> n4 = new Node<Integer>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
	}

	// Print the linked list
	public static void print(Node<Integer> head) {
		Node<Integer> currentLink = head;

		while (currentLink != null) {
			System.out.println(currentLink.data);
			currentLink = currentLink.next;
		}
	}

	// increment all elements in linked list
	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkList();
		System.out.println(head);
		print(head);
		increment(head);
		print(head);

		Node<Integer> newHead = InsetNode.insertNode(head, 1, 100);
		print(newHead);
	}
}
