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

		// get(int index)
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Chiku");
		fruits.add("Sitafal");

		String elementAtIndex3 = fruits.get(3);
		System.out.println("Fruit avialable at index 3 is: " + elementAtIndex3);

		// index of (Object o)
		int indexAtMango = fruits.indexOf("Mango");
		System.out.println("Index at Mango is: " + indexAtMango);

		// isEmpty()
		boolean noFruits = fruits.isEmpty();
		System.out.println("Is fruits basket empty: " + noFruits);

		// iterator()
		Iterator<String> iterator = fruits.iterator();
		System.out.print("ArrayList elements using iterator: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();

		// lastIndexOf(Object o)
		int lastChiku = fruits.lastIndexOf("Chiku");
		System.out.println("Last index of 'Chiku' :" + lastChiku);

		// listIterator()
		ListIterator<String> listIterator = fruits.listIterator();
		System.out.print("ArrayList elements using list iterator (forward): ");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next() + " ");
		}
		System.out.println();

		// listIterator(int index)
		ListIterator<String> reverseListIterator = fruits.listIterator(fruits.size());
		System.out.print("ArrayList elements using list iterator (backward): ");
		while (reverseListIterator.hasPrevious()) {
			System.out.println(reverseListIterator.previous() + " ");
		}
		System.out.println();

		// remove(int index)
		fruits.remove(1);
		System.out.println("After removing index 1: " + fruits);

		// remove(Object o)
		fruits.remove("Sitafal");
		System.out.println("After removing Sitafal: " + fruits);

		// removeAll(Collection<?> c)
		Collection<String> toRemove = Arrays.asList("Mango", "Chiku");
		fruits.removeAll(toRemove);
		System.out.println("After removing Mango&Chiku: " + fruits);

		// retainAll(Collection o)
		Collection<String> toRetain = Arrays.asList("Grapes");
		fruits.retainAll(toRetain);
		System.out.println("After retaining the grape fruit: " + fruits);

		// set(int index, E element)
		fruits.add("rottenMuskMelon"); // Since array is empty at this point
		fruits.set(0, "MuskMelon");

		System.out.println("After setting the index '0' to MuskMelon: " + fruits);

		fruits.add("Dragon Fruit"); //just to make objects in ArrayList
		fruits.add(" Watermelon");
		fruits.add("Pomograinate");
		
		// size()
		int noOfFruits = fruits.size();
		System.out.println("Number of fruits: " + noOfFruits);

		// subList(int fromIndex, int toIndex)
		List<String> subList = fruits.subList(0, 1);
		System.out.println("Sublist: " + subList);

		// toArray()
		Object[] array = fruits.toArray();
		System.out.println("Array representaion of ArrayList: " + Arrays.toString(array));

		// toArray(T[] a)
		String[] array2 = fruits.toArray(new String[0]);
		System.out.println("Array representaion of the ArrayList (Using Specified Array): " + Arrays.toString(array2));
	}

}
