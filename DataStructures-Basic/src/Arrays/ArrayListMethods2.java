package Arrays;

import java.util.*;

public class ArrayListMethods2 {

	public static void main(String[] args) {
		// Create an ArrayList
		List<String> fruits = new ArrayList<>();

		// add
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println("Initial ArrayList: " + fruits);

		// add(int index, E element)
		fruits.add(1, "Orange");
		System.out.println("ArrayList after adding Orange at index '1': " + fruits);

		// addAll(Collection<? extends E> c)
		Collection<String> moreFruits = Arrays.asList("Pineapple", "Kiwi", "Mango");
		fruits.addAll(moreFruits);
		System.out.println("ArrayList after adding more fruits: " + fruits);

		// addAll(int index, Collection<? extends E> c)
		Collection<String> additionalFruits = Arrays.asList("Jackfruit", "Watermelon");
		fruits.addAll(3, additionalFruits);
		System.out.println("After adding additional fruits at index '3': " + fruits);

		// clear()
		fruits.clear();
		System.out.println("After clearing fruits: " + fruits);

		// contains(Object O)
		boolean containsOrange = fruits.contains("Orange");
		System.out.println("The fruits basket contans Orange? :" + containsOrange);

	}

}
