package LinkedLists;

import java.util.*;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class BasicExample {

	Node head;

	public BasicExample() {
		this.head = null;
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node currentNode = this.head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public void printList() {
		Node currentNode = this.head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		BasicExample linkedList = new BasicExample();
		linkedList.addNode(20);
		linkedList.addNode(20);
		linkedList.addNode(30);

		linkedList.printList();
	}

}
