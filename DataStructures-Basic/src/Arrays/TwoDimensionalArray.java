package Arrays;
/*In this code snippet, we create a two-dimensional array called grades to store the grades of students in different subjects. The array is initialized with some sample grades. We then use nested for loops to iterate over the array, accessing each element using row and column indices, and printing the grade along with the student and subject information.*/

public class TwoDimensionalArray {
	public static void main(String[] args) {
		// Create a two-dimensional array to store student grades
		int[][] grades = { { 85, 92, 78 }, { 91, 76, 97 }, { 86, 88, 100 } };

		// Access and print the elements of the array
		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				System.out.println("Grade of student " + (i + 1) + ", Subject " + (j + 1) + ": " + grades[i][j]);
			}
		}

	}

}
