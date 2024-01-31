import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many subject marks u want to store ?");
		int n = sc.nextInt(); // 5 subjects marks

		// Array Creation
		int[] marks = new int[n];

		// Insertion(adding elements)
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter " + (i + 1) + " subject marks:");
			marks[i] = sc.nextInt();
		}

		// Traversal (visit every elements)
		// Two-ways
		// For loop/enhanced(for-each) loop
		// method-1
		for (int j = 0; j < marks.length; j++) {
			System.out.print(marks[j] + " ");
		}

		System.out.print("\n");

		// method-2
		for (int x : marks) {
			System.out.print(x + " ");
		}
	}
}
