

public class CoinSums {
	
	private static final int[] bench = {2, 3, 5, 11, 21, 41, 101, 201};
	private static final int[] unit = {200, 100, 50, 20, 10, 5, 2, 1};
	private static final int length = bench.length;
	private static int sum = 0;
	
	public static void main(String[] args) {
		calc(0, 0);
		System.out.println("There are " + sum + " different ways to make a two pounds");
	}
	
	private static void calc(int heri, int index) {
		for(int am = 0; am < bench[index]; am++) {
			int tmpSum = heri;
			tmpSum += (am * unit[index]);
			if(tmpSum == 200) {
				sum++;
				return;
			} else if(tmpSum > 200) {
				return;
			} else {
				int down = tmpSum;
				int indexPass = index + 1;
				if(indexPass >= length) {
					indexPass = length - 1;
					continue;
				} else {
					calc(down, indexPass);
				}
			}
		}
	}
}