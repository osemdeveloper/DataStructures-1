package Arrays;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {
		// Create an ArrayList to store student records
		List<Person> studentRecords = new ArrayList<>();

		// Add student records to the list
		studentRecords.add(new Person("John", 21));
		studentRecords.add(new Person("meck", 34));
		studentRecords.add(new Person("dave", 24));
		studentRecords.add(new Person("berk", 19));
		studentRecords.add(new Person("alice", 22));

		// Display the student records
		System.out.println("Initial student records:");
		displayStudentRecords(studentRecords);

		// Update a student's age
		int studentIndexToUpdate = 1;
		studentRecords.get(studentIndexToUpdate).setAge(21);

		// remove a student record
		int studentIndexToRemove = 2;
		studentRecords.remove(studentIndexToRemove);

		// Add a new student record
		Person newStudent = new Person("Emily", 28);
		studentRecords.add(newStudent);

		// Display modified student records
		System.out.println("\nModified student records:");
		displayStudentRecords(studentRecords);

	}

	public static void displayStudentRecords(List<Person> studentRecords) {
		for (Person student : studentRecords) {
			System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
		}
	}

}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
