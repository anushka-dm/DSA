import java.util.Scanner;
import java.util.LinkedList;



public class LinkedListCreation {

	public static int length(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static Node<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null, tail = null;

		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}

			data = sc.nextInt();
		}

		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		System.out.println(length(head));

	}

}
