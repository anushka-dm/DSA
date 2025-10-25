// Problem statement
// You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'

//  Write a function to add a node to the list with the 'data' at the specified position, 'pos.'

// Note :
// Assume that the Indexing for the singly linked list always starts from 0.

// If the position is greater than the length of the singly linked list, you should return the same linked list without any change.
//  Illustration :
// The following images depict how the insertion has been taken place.

public class InsetNode {
	public static Node<Integer> insertNode(Node<Integer> head, int pos, int data) {

		Node<Integer> newNode = new Node<Integer>(data);
		if (pos == 0) {
			newNode.next = head.next;
			return newNode;
		}

		Node<Integer> temp = head;
		int current = 0;

		// Traverse to node before desired position

		while (temp != null && current < pos - 1) {
			temp = temp.next;
			current++;
		}

		// If position is out of bounds
		if (temp == null) {
			return head;
		}

		// Insert in between
		newNode.next = temp.next;
		temp.next = newNode;

		return head;
	}

}
