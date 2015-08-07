

public class DigitFifthPowers {
	public static void main(String[] args) {
		int sum = 0;
		for(int a = 32; a < 354296; a++) {
			int a1 = a / 100000;
			int a2 = (a - a1 * 100000) / 10000;
			int a3 = (a - a1 * 100000 - a2 * 10000) / 1000;
			int a4 = (a - a1 * 100000 - a2 * 10000 - a3 * 1000) / 100;
			int a5 = (a - a1 * 100000 - a2 * 10000 - a3 * 1000 - a4 * 100) / 10;
			int a6 = (a - a1 * 100000 - a2 * 10000 - a3 * 1000 - a4 * 100 - a5 * 10);
			
			int p1 = power(a1);
			int p2 = power(a2);
			int p3 = power(a3);
			int p4 = power(a4);
			int p5 = power(a5);
			int p6 = power(a6);
			
			int tmp = p1 + p2 + p3 + p4 + p5 + p6;
			
			if(a == tmp) {
				sum += a;
				System.out.println(a);
			}
		}
		System.out.println("sum = " + sum);
	}
	
	private static int power(int inPut) {
		return (int) Math.pow(inPut, 5);
	}
}