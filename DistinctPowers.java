import java.util.HashSet;
import java.math.BigInteger;

public class DistinctPowers {
	private static HashSet<BigInteger> dPwers = new HashSet<BigInteger>();
	private static BigInteger TWO = new BigInteger("2");
	private static BigInteger BENCH = new BigInteger("101");
	
	public static void main(String[] args) {
		BigInteger a = new BigInteger("2");
		BigInteger pwr = new BigInteger("0");
		for(a.equals(TWO); a.compareTo(BENCH) == -1; a = a.add(BigInteger.ONE)) {
			for(int b = 2; b < 101; b++) {
				pwr = a.pow(b);;
				dPwers.add(pwr);
			}
		}
		System.out.println("There are " + dPwers.size() + " distinct terms are in the sequence generated");
	}
}