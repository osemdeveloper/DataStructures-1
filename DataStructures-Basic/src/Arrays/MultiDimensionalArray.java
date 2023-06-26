package Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		// Create a multi-dimensional array to store sales data
		int[][][] sales = { { { 5, 6, 8 }, { 3, 9, 7 }

				}, { { 0, 5, 8 }, { 2, 6, 4 }

				},

		};

		// Access and print the elements of the array
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {
				for (int k = 0; k < sales[i][j].length; k++) {
					System.out.println("Sales of Region " + (i + 1) + ",Quarter " + (j + 1) + ", Month " + (k + 1)
							+ ": " + sales[i][j][k]);
				}
			}
		}
	}
}
