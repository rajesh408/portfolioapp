import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many student marks you want to store :");
		int n = sc.nextInt();

		// creation
		int[] marks = new int[n]; // 5 student marks

		// insertion
		for (int a = 0; a < marks.length; a++) {
			System.out.println("Enter " + (a + 1) + " student marks:");
			marks[a] = sc.nextInt(); // 0,1,2,3,4
		}

		// traversal methods-1 (for loop-using length)
		for (int a = 0; a < marks.length; a++)
			System.out.print(marks[a] + " ");

		System.out.println();
		marks[1] = 0;

		// traversal methods-2 (foreach-loop)
		for (int x : marks)
			System.out.print(x + " ");

	}

}
