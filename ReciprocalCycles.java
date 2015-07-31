import java.math.BigInteger;


public class ReciprocalCycles {
	
	private static final BigInteger NINE = new BigInteger("9");

	public static void main(String[] args){
		int d = 1;
		int length = 0;
		int maxD = 0;
		
		for( d = 1; d < 1001; d++) {
			int tmpLength = 0;
			int m = d;
			while(true) {
				if(m % 2 == 0) {
					m /= 2;
					continue;
				}else if(m % 5 == 0) {
					m /= 5;
					continue;
				}else if(m == 1) {
					break;
				} else {
					BigInteger t = new BigInteger("9");
					BigInteger mBig = new BigInteger(Integer.toString(m));
					while(t.mod(mBig) != BigInteger.ZERO) {
						t = t.multiply(BigInteger.TEN);
						t = t.add(NINE);
					}
					tmpLength = t.toString().length();
					break;
				}
			}

			if(tmpLength > length) {
				maxD = d;
				length = tmpLength;				
			}
		}
		System.out.println("maxD = " +maxD);
	}
}