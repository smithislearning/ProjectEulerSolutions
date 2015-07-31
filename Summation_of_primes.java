import java.util.ArrayList;

public class Summation_of_primes{
	public static void main(String[] args){
		long sum = 0L;
		long l = 0L;
		int j = 0;
		long k = 0L;
		ArrayList<Long> primeList = new ArrayList<Long>();
		primeList.add(2L);
		sum += 2L;
		primeList.add(3L);
		sum += 3L;
		for(long i = 4L; i <= 2000000; i++){
			for (j = 0; j < primeList.size(); j++){
				k = primeList.get(j);
				l = i % k;
				if (l == 0){
					break;
				} else if (k > Math.sqrt(i)){
					break;
				} else {
					continue;
				}
			}
			if (l != 0){
				primeList.add(i);
				System.out.println("i = " + i);
				sum += i;
				System.out.println("sum = " + sum);
				continue;
			} else {
				continue;
			}
		}
		System.out.println("sum is " + sum);
	}
}