package LinkedLists;

import java.util.HashSet;

//The removeDuplicates method removes duplicate medicines from the linked list. It uses a HashSet to keep track of the unique medicine names encountered so far.

class Medicine {
	String name;
	String description;
	Medicine next;

	public Medicine(String name, String description) {
		this.name = name;
		this.description = description;
		this.next = null;

	}
}

class MedShop {
	Medicine head;

	public void addMedicine(String name, String description) {
		Medicine newMedicine = new Medicine(name, description);

		if (head == null) {
			head = newMedicine;
		} else {
			Medicine current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newMedicine;
		}
	}

	public void removeDuplicates() {
		if (head == null) {
			return;
		}

		HashSet<String> uniqueMedicenes = new HashSet<>();
		Medicine current = head;
		Medicine previous = null;

		while (current != null) {
			String currentMedicineName = current.name;

			if (uniqueMedicenes.contains(currentMedicineName)) {
				// Duplicate node found, remove it
				previous.next = current.next;
			} else {
				// New unique node found, add it to the Hashset
				uniqueMedicenes.add(currentMedicineName);
				previous = current;
			}

			current = current.next;
		}
	}

	public void printMedicines() {
		Medicine current = head;

		if (current == null) {
			System.out.println("Medicine Shop is Empty");
		} else {
			System.out.println("Medicine in medshop:");
			while (current != null) {
				System.out.println("Name: " + current.name + ", Description: " + current.description);
				current = current.next;
			}
		}
	}
}

public class DuplicateMedicines {

	public static void main(String[] args) {
		MedShop medShop = new MedShop();

		// Add medicine to the shop
		medShop.addMedicine("Calpal", "Heals fever");
		medShop.addMedicine("Dolo", "covid suppliment");
		medShop.addMedicine("COD Liver", "aids sleep");
		medShop.addMedicine("Crocin", "old medicine to treat fever");
		medShop.addMedicine("Neousprin", "Wound Ointmrnt");
		medShop.addMedicine("Dolo", "covid suppliment");

		// Print the original list
		System.out.println("Original Medicines");
		medShop.printMedicines();

		// Remove duplicates
		medShop.removeDuplicates();

		// After removing duplicates
		medShop.printMedicines();

	}

}
