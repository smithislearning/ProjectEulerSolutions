
public class Amicable_numbers {
	
	private static int d(int n) {
		int properDevisor = 0;
		for (int i = 1; i < n; i++) {
			if ((double)n / (double)i == Math.floor(n/i)) {
				properDevisor += i;
			}
		}
		return properDevisor;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		for (int j = 2; j < 10000; j++) {
			if (j == d(d(j)) && j != d(j)) {
//				System.out.println("amicable number of " + j + " is " +d(j));
				sum += d(j);
//				System.out.println("amicable numbers now is " + sum + ".");
			}
		}
		System.out.println("sum of all amicable numbers under 10000 is " + sum + ".");
	}
}