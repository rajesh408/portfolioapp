import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arrLst = new ArrayList();

		Scanner sc = new Scanner(System.in);
		System.out.println("Type '@' for stop adding the elements:-");
		while (true) {
			System.out.println("Enter an element:");
			String item = sc.next();

			if (item.equals("@"))
				break;
			else
				arrLst.add(item);
		}

		System.out.println("Total course : " + arrLst.size());

		// Traverse-
		/*
		 * for(int i=0;i<arrLst.size();i++) { System.out.print(arrLst.get(i)+" "); }
		 */

		// iterator
		Iterator itr = arrLst.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * System.out.println("Listing elements before sorting:-"); for(Object s:arrLst)
		 * { System.out.println(s); }
		 * 
		 * Collections.sort(arrLst);
		 * 
		 * System.out.println("Listing elements after sorting:-"); for(Object s:arrLst)
		 * { System.out.println(s); }
		 */
		// System.out.println("\n"+arrLst.contains("JDBC"));
	}
}
