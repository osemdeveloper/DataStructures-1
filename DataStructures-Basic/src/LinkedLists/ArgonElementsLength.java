package LinkedLists;

class Element {
	String name;
	Element next;

	public Element(String name) {
		this.name = name;
		this.next = null;
	}
}

class PeriodicTable {
	Element head;

	public void addElement(String name) {
		Element newElement = new Element(name);

		if (head == null) {
			head = newElement;
		} else {
			Element current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newElement;
		}
	}

	public int getLength() {
		int count = 0;
		Element current = head;

		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void printElemens() {
		Element current = head;

		if (current == null) {
			System.out.println("Periodic table is empty");
		} else {
			System.out.println("Elements in Periodic Table:");
			while (current != null) {
				System.out.println("Element: " + current.name);
				current = current.next;
			}
		}
	}
}

public class ArgonElementsLength {

}
