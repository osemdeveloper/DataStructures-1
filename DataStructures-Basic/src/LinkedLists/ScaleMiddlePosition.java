package LinkedLists;

//We'll implement the code to find the middle position on the scale and retrieve the object available at that position.

class ScaleObject {
	double length;
	String description;
	ScaleObject next;

	public ScaleObject(double length, String description) {
		super();
		this.length = length;
		this.description = description;
		this.next = null;
	}

}

class GeometricalScale {
	ScaleObject head;

	public void addObject(double length, String description) {
		ScaleObject newObject = new ScaleObject(length, description);

		if (head == null) {
			head = newObject;
		} else {
			ScaleObject current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = newObject;
		}
	}

	public ScaleObject getObjectAtMiddlePosition() {
		if (head == null) {
			return null;
		}
		ScaleObject slow = head;
		ScaleObject fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}

public class ScaleMiddlePosition {
	public static void main(String[] args) {
		GeometricalScale scale = new GeometricalScale();

		// Add objects to scale
		scale.addObject(0.0, "Start");
		scale.addObject(10.0, "Low");
		scale.addObject(20.0, "medium");
		scale.addObject(30.0, "High");
		scale.addObject(40.0, "End");

		// Find the object at the middle position
		ScaleObject middleObject = scale.getObjectAtMiddlePosition();

		if (middleObject != null) {
			System.out.println("Object at the middel : Length " + middleObject.length + ", Description: "
					+ middleObject.description);
		} else {
			System.out.println("Geometrical Scale is Empty.");

		}

	}

}
