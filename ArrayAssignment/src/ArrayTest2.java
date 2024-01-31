
public class ArrayTest2 {

	public static void main(String[] args) {
		int marks[] = { 45, 60, 75, 82, 34 }; // dec+inst+init

		int total = 0;

		for (int x : marks) {
			total += x; // total=total+x;
		}
		System.out.println("Total : " + total);

		int max = marks[0]; // 82
		for (int i = 0; i < marks.length; i++) {// 5
			if (max < marks[i]) // 82<35
				max = marks[i];
		}
		System.out.println("Highest marks : " + max);
	}

}
