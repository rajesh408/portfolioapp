import java.util.Scanner;

public class Employee {
	private int eID;
	private String name;
	private float salary;

	public Employee(int eID, String name, float salary) {
		this.eID = eID;
		this.name = name;
		this.salary = salary;
	}

	public int geteID() {
		return eID;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		/*
		 * Employee obj1 =new Employee(101,"John", 45000); Employee obj2 = new
		 * Employee(102,"Smith", 35000); Employee obj3 new Employee(103,"Harry", 30000);
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("How many employee details u want to store ?");
		int n = sc.nextInt();// 3

		Employee[] empObj = new Employee[n]; // dynamic

		System.out.println("Accepting employee details:-");
		for (int i = 0; i < empObj.length; i++) {
			System.out.println("Accepting " + (i + 1) + " employee details:-");
			System.out.println("Enter emp ID :");
			int eid = sc.nextInt();
			System.out.println("Enter emp Name :");
			String nm = sc.next();
			System.out.println("Enter emp Salary :");
			float sal = sc.nextFloat();
			empObj[i] = new Employee(eid, nm, sal);
		}

		System.out.println("Displaying employee details:-");
		for (int i = 0; i < empObj.length; i++) {
			Employee emp = empObj[i];
			System.out.println(emp.eID + " " + emp.name + " " + emp.salary);
		}

	}

}
