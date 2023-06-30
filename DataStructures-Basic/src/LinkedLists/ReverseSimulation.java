package LinkedLists;
//linked list to represent a chain of connected objects, and the need arises to reverse the order of the objects to simulate their motion in the opposite direction

class PhysicalObject {
	String name;
	double position;
	PhysicalObject next;

	public PhysicalObject(String name, double position) {
		this.name = name;
		this.position = position;
		this.next = null;
	}
}

class ObjectChain {
	PhysicalObject head;

	public void addObject(String name, double position) {
		PhysicalObject newObject = new PhysicalObject(name, position);

		if (head == null) {
			head = newObject;
		} else {
			PhysicalObject current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newObject;
		}
	}

	public void reverseSimulation() {
		PhysicalObject prev = null;
		PhysicalObject current = head;
		PhysicalObject next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
	}

	public void printChain() {
		PhysicalObject current = head;

		if (current == null) {
			System.out.println("Chain ids Empty!!");
		} else {
			System.out.println("Object chain:");
			while (current != null) {
				System.out.println("Name: " + current.name + ", Position:  " + current.position);
				current = current.next;
			}
		}
	}
}

public class ReverseSimulation {

	public static void main(String[] args) {
		ObjectChain objectChain = new ObjectChain();

		// Add Objects to the chain
		objectChain.addObject("Box", 0.0);
		objectChain.addObject("Table", 1.0);
		objectChain.addObject("Person", 2.0);
		objectChain.addObject("Wall", 3.0);
		objectChain.addObject("Water", 4.0);

		// Original Chain
		System.out.println("Original Chain:");
		objectChain.printChain();

		// reverse the chain
		objectChain.reverseSimulation();

		// Print the reversed chain
		System.out.println("Reversed Chain:");
		objectChain.printChain();
	}

}
