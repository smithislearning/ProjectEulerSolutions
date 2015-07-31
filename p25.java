import java.math.BigInteger;

public class p25 {
	
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		int indexFibo = 2;
		
		BigInteger bench = new BigInteger("10");
		bench = bench.pow(999);
		
		while(true){
			b = b.add(a);
			indexFibo++;
			if(b.compareTo(bench) >= 0) {
				System.out.println(indexFibo);
				break;
			}
			a = a.add(b);
			indexFibo++;
			if(a.compareTo(bench) >= 0) {
				System.out.println(indexFibo);
				break;
			}
		}
	}
}