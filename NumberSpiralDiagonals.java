import java.util.ArrayList;

public class NumberSpiralDiagonals {
	private static ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
	
	
	public static void main(String[] args) {
		int sum = 0;
		int givenB = 1001;
		arrayInit(givenB);
		sum = dSum();
		System.out.println("Sum of the numbers on the diagonals is in a " + givenB + " by " + givenB
			 + " spiral is " + sum + ".");
	}
	
	private static void arrayInit(int bound) {
		int nBound = (bound - 1) / 2;
//		System.out.println("nBound = " + nBound);
		for(int n = 0; n < nBound + 1; n++) {
//			System.out.println("n = " + n);
			int l = 2 * n + 1;
			int g_l = 2 * n - 1;
			if(g_l < 0) {
				g_l = 0;
			}
			int tmpLB = g_l * g_l + 1;
//			System.out.println("tmpLB = " + tmpLB);
			int tmpUB = l * l + 1;
//			System.out.println("tmpUB = " + tmpUB);
			array.add(new ArrayList<Integer>());
			
			for(int i = tmpLB; i < tmpUB; i++) {
				array.get(n).add(i);
			}
		}
//		for(ArrayList<Integer> xArray : array) {
//			System.out.println(xArray);
//		}
//		System.out.println(array);
	}
	
	private static int dSum() {
		int tmpSum = 1;
		for(int n = 1; n < array.size(); n++){
			int d_l = 2 * n;
			int upperB = array.get(n).size() / d_l + 1;
//			System.out.println("upperB = " + upperB);
			for(int m = 1; m < upperB; m++) {
				tmpSum += array.get(n).get(m * d_l - 1);
//				System.out.println(array.get(n).get(m * d_l - 1));
//				System.out.println("tmpSum = " + tmpSum);
			}
		}
		return tmpSum;
	}
}