import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class NonAbundantSums {
	
	private static AbundantList list = new AbundantList();
	
	public static void main(String[] args){
		long allSum = sumAll();
		long abdSum = list.sum;
		long nonAbdsum = allSum - abdSum;
		System.out.println("Sum of all numbers can't be written as a sum two abundant numbers is "
			+ nonAbdsum + ".");
	}
	
	private static long sumAll(){
		long sum = 0L;
		for(long num = 1L; num < 28124L; num++) {
			sum += num;
		}
		return sum;
	}
}

class AbundantList {
	private ArrayList<Long> abundantList = new ArrayList<Long>();
	private HashSet<Long> sumHash = new HashSet<Long>();
	public long sum = 0L;
	
	
	public AbundantList() {
		this.sum = abundantList();
	}
	
	private long abundantList() {		
		int abundantNum = 0;
		int mid = 14062;
		
		long adSum = 0L;
		long dup = 0L;
				
		abundantList.add(12L);
		for(abundantNum = 13; abundantNum < 28124; abundantNum ++) {
			long tmpSum = 0L;
			for(int i = 1; i < abundantNum - 1; i++) {
				if(abundantNum % i == 0) {
					tmpSum += i;
				} else {
					continue;
				}
			}
			if(tmpSum > abundantNum) {
				if(abundantNum + abundantList.get(0) > 28123) {
					break;
				} else {
					abundantList.add((long)abundantNum);
					continue;
				}
			} else {
				continue;
			}
		}
		
		int b = abundantList.indexOf(14064L);
		for(int a = 0; a <b ; a++) {
			for(int c = a; c < abundantList.size() - 1; c++) {
				long tmpValue = abundantList.get(a) + abundantList.get(c);
				if (tmpValue > 28123L) {
					break;
				} else {
					sumHash.add(tmpValue);
				}
			}
		}
		while(sumHash.iterator().hasNext()){
			adSum += sumHash.iterator().next();
			sumHash.remove(sumHash.iterator().next());
		}
		return adSum;
	}
}
