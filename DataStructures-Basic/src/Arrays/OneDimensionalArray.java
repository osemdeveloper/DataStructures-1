package Arrays;

/*In this code snippet, we create a one-dimensional array called scores to store the scores of students. The array is initialized with some sample scores. We then iterate over the array using a for loop, accessing each element using its index, and printing the score along with its corresponding number*/

public class OneDimensionalArray {

	public static void main(String[] args) {
		// Create an array to store student scores
		int[] scores = { 85, 92, 78, 90, 87 };

		// Access and print the elements of the array
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Score #" + (i + 1) + ": " + scores[i]);
		}
	}

}
