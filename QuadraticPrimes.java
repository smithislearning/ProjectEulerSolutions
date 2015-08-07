import java.util.ArrayList;


public class QuadraticPrimes{
	public static void main(String[] args){
		ArrayList<Integer> benchList = new ArrayList<Integer>();
		ArrayList<Integer> ref = new ArrayList<Integer>();

		benchList = bench(1000);
		ref = bench(1000);
		
		int maxLength = 0;
		int maxA = 0;
		int maxB = 0;
		
		for(int i = 1; i < benchList.size() - 1; i++) {
			int b = benchList.get(i);
			int m = 0;
			for(m = -499; m < 500; m++) {
				int a = 0;
				if(b == 2) {
					a = 2 * m;
				} else {
					a = 2 * m + 1;
				}
				ArrayList<Integer> result = new ArrayList<Integer>();
				for(int n = 0; ; n++) {
					int tmp = n * n + a * n + b;
					if(tmp < 2 || checkExpand(tmp, ref) == false) {
						break;
					} else {
						result.add(tmp);
					}
				}
				if(result.size() > maxLength) {
					maxLength = result.size();
					maxA = a;
					maxB = b;
					result.clear();
				}
			}
		}
		System.out.println("maxLength = " + maxLength);
		System.out.println("a = " + maxA);
		System.out.println("b = " + maxB);
		System.out.println(maxA * maxB);
	}

	
	private static ArrayList<Integer> bench(int bound) {
		ArrayList<Integer> benList = new ArrayList<Integer>();
		benList.add(2);
		benList.add(3);
		for(int i = 2; i < bound; i++){
			boolean tmp = checkExpand(i, benList);
		}
		
		return benList;
	}
	
	private static boolean checkExpand(int inPut, ArrayList<Integer> inList) {
		if(inList.contains(inPut)) {
				return true;
		} else {
			int j = 0;
			int k = 0;
			int l = 0;
			for (j = inList.size(); j >  0; j--){
				k = inList.get(j - 1);
				l = inPut % k;
				if (l == 0){
					break;
				} else {
					continue;
				}
			}
			if(l != 0) {
				inList.add(inPut);
				return true;
			} else {
				return false;
			}
		}
	
}}