import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		String[][] name = new String[2][3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			if (i == 0)
				System.out.println("Accepting firstnames :");
			else
				System.out.println("Accepting lastnames :");

			for (int j = 0; j < 3; j++) {
				System.out.println("Enter " + (j + 1) + " name:");
				name[i][j] = sc.next();
			}
		}
		System.out.println("Displaying details:");
		for (int i = 0; i < 3; i++) {
			System.out.println(name[0][i] + " " + name[1][i]);
		}

	}

}
