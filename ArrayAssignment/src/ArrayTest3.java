import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		int marks[] = { 45, 160, 75, 82, 34 };

		System.out.println("Array elements before sorting:");
		for (int x : marks)
			System.out.print(x + " ");

		System.out.println();
		Arrays.sort(marks);

		/*
		 * //Bubble sort- for(int i=0; i<marks.length-1; i++) { for(int
		 * j=0;j<marks.length-i-1;j++) { //3<4 if(marks[j]>marks[j+1]) { //swapping int
		 * temp = marks[j]; marks[j]=marks[j+1]; marks[j+1]=temp; } } }
		 */
		System.out.println("Array elements after sorting:");
		for (int x : marks)
			System.out.print(x + " ");
	}

}
