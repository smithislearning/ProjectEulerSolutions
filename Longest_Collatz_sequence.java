import java.util.ArrayList;


public class Longest_Collatz_sequence{
	private static long count = 1L;
	private static long maxCount = 0L;
	private static long start = 0L;
	private static long nums = 0L;
	private static ArrayList<Long> startCountList = new ArrayList<Long>();
	private static long indexOfCount = 0;
	
	
	public static void main(String[] args){
		startCountList.add(0L);
		startCountList.add(1L);
		for (start = 2L; start < 1000000L; start++) {
			nums = start;
			while (true) {
				if (nums % 2L == 0L){
					nums = nums / 2L;
				} else if (nums % 2L == 1L) {
						nums = 3L * nums + 1L;
				}
				count++;
				
				if (nums == 1L) {
					startCountList.add((int)start, count);
					break;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
			count = 0;
		}
		indexOfCount = startCountList.indexOf(maxCount);
		System.out.println("maximum count = " + maxCount + ", starting number = " + indexOfCount);
	}
}