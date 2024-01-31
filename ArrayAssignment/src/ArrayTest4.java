import java.util.Arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		String[] name = { "Poonam", "Swati", "Nisha", "Anchal" };
		System.out.println("Array elements before sorting:");
		for (String nm : name)
			System.out.print(nm + " ");
		System.out.println();

		Arrays.sort(name);
		System.out.println("Array elements after sorting:");
		for (String nm : name)
			System.out.print(nm + " ");
		System.out.println();
	}

}
