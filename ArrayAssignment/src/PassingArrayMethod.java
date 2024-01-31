
public class PassingArrayMethod {

	public static float sumSalary(float[] salary) {
		float sum = 0;
		for (int i = 0; i < salary.length; i++)
			sum += salary[i]; // sum=sum+salary[i]
		return sum;
	}

	public static void main(String[] args) {
		float[] empSalaries = { 45000, 25000.500f, 30000, 45000, 20000 };

		float total = sumSalary(empSalaries); // passing an array to a method
		System.out.println("Total salaries :" + total);
	}

}
