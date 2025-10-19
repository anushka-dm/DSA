// Problem statement
// For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

//  Note :
// 1. Assume that the Indexing for the singly linked list always starts from 0.
// 2. If the given position 'i',  is greater than the length of the given singly linked list, then don't print anything.

import java.util.Scanner;

public class PrintIth {

	public static void printIthNode(Node<Integer> head, int i) {
		Node<Integer> temp = head;
		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
			if (count == i) {
				System.out.println(temp.data);
				break;
			}
		}

		if (i > count) {
			System.out.println("Does not exist");
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedListCreation.takeInput();
		int idx = 3;

		printIthNode(head, idx);

	}
}
