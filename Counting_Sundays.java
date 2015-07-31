
public class Counting_Sundays{
	private static int sum = 0;
	private static int lastDay = 0;
	
	private static int firstDay1901(){
		int day = 365 % 7;
//		System.out.println(sum);
//		System.out.println(day);
		return day;
	}
	
	private static int firstOfMonth(int d, int y){
		int count = 0;
		for (int m = 0; m < 12; m++) {
			switch(m){
			case 0:
				lastDay = d;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				lastDay = (lastDay + 30) % 7;
			case 4: case 6: case 9: case 11:
				lastDay = (lastDay + 29) % 7;
			case 2:
				if (y % 4 == 0) {
					lastDay = (lastDay + 28) % 7;
				} else {
					lastDay = (lastDay + 27) % 7;
				}
			}
			if (lastDay  + 1 == 7) {
					++count;
			}
		}
//		System.out.print(count);
		return count;
	}
	
	public static void main(String[] args){
		lastDay = firstDay1901();
//		int i = 1901;
		for (int i = 1901; i < 2001; i++) {
			sum += firstOfMonth(lastDay, i);
		}
		System.out.println(sum);
	}
}