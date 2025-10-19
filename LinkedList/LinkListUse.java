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

	public static void main(String[] args) {
		Node<Integer> head = createLinkList();
		System.out.println(head);
		Node<Integer> currentLink = head;
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		// Print the linked list
		while (currentLink != null) {
			System.out.println(currentLink.data);
			currentLink = currentLink.next;
		}
	}
}
