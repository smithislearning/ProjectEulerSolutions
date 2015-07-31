

public  class Number_letter_counts{
	private static final String nums[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private static final String tens[] = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	private static final String teens[] = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static final String hundred = "hundred";
	private static final String thousand = "thousand";
	
	private static int number = 0;
	private static long sum = 0L;
	private static int tmp = 0;
	
	private static void calc(int a){
		if (a > 1000) {
			System.out.println("Number out of bound");
		} else if (a == 1000) {
				tmp = (int)Math.floor(a / 1000);
				a -= tmp * 1000;
				sum += nums[tmp].length() + thousand.length();
				calc(a);
		} else if (a > 99) {
			tmp = (int)Math.floor(a / 100);
			a -= tmp * 100;
			sum += nums[tmp].length() + hundred.length();
			if (a > 0) {
				sum += 3;
			}
			calc(a);
		} else if (a > 19) {
			tmp = (int)Math.floor(a / 10);
			a -= tmp * 10;
			sum += tens[tmp].length();
			calc(a);
		} else if (a > 10) {
			tmp = a - 10;
			sum += teens[tmp].length();
		} else if (a == 10) {
			sum += tens[1].length();
		} else if (a > 0) {
			sum += nums[a].length();
		}
	}
	
	public static void main(String[] args){
		for (number = 1; number < 1001; number ++){
			calc(number);
		}
		System.out.println(sum);
	}
}
		