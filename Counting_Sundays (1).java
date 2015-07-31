
public class Counting_Sundays{
	private static int sum = 0;
	private static int lastDay = 0;
	private static int firstDay = 0;
	
	private static int lastDay1900(){
		int day = (1 + 365 % 7) % 7;
		return day;
	}
	
	private static int firstOfMonth(int d, int y){
		int count = 0;
		lastDay = d;
		
		for (int m = 1; m < 13; m++) {
			firstDay = lastDay + 1;
			
			switch(m){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				lastDay = (firstDay + 2) % 7;
				break;
			case 4: case 6: case 9: case 11:
				lastDay = (firstDay + 1) % 7;
				break;
			case 2:
				if (y % 4 == 0) {
					lastDay = (firstDay) % 7;
					break;
				} else {
					lastDay = (firstDay + 6) % 7;
					break;
				}
			}
			if (firstDay == 7) {
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		lastDay = lastDay1900();
		for (int i = 1901; i < 2001; i++) {
			sum += firstOfMonth(lastDay, i);
		}
		System.out.println(sum);
	}
}