package Arrays;

 class Student {
	private String name;
	private int age;
	private String grade;

	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGrade() {
		return grade;
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		// Array of student objects
		Student[] students = new Student[3];

		// Create student objects and populate the array
		students[0] = new Student("Alice", 18, "A");
		students[1] = new Student("Bob", 17, "B");
		students[2] = new Student("Charlie", 19, "A-");

		// Print details of each student
		System.out.println("Student Details:");
		for (Student student : students) {
			System.out.println("Name: " + student.getName());
			System.out.println("Age: " + student.getAge());
			System.out.println("Grade: " + student.getGrade());
			System.out.println();
		}
	}

}
