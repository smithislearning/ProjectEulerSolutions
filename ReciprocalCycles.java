import java.util.ArrayList;


public class ReciprocalCycles {

	public static void main(String[] args){
		long n = 1L;
		long d = 1L;
		long t = 9L;
		long a = 2L;
		long b = 5L;
		int length = 0;
		
		for( d = 2L; d < 1001L; d++) {
			int tmpLength = 0;
			long m = d;
			while(true) {
				if(m % 2L == 0L) {
					m /= 2L;
					continue;
				}else if(m % 5L == 0L) {
					m /= 5L;
					continue;
				}else if(m == 1L) {
					break;
				} else if(t % m != 0L) {
					System.out.println("in it d = " + d);
					System.out.println("in it m = " + m);
					t = t * 10L + 9L;
					System.out.println("t = " + t);
					continue;
				} else {
					n = t / d;
					System.out.println("d = " + d);
					System.out.println("m = " + m);
					System.out.println("recurring cycle length = " + Long.toString(n).length());
					tmpLength = Long.toString(n).length();
					n = 1L;
					t = 9L;
					break;
				}
			}
			if(tmpLength >= length) {
				length = tmpLength;
			}
		}
		System.out.println(length);
	}
}