import java.util.ArrayList;

public class PandigitalProducts {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1099; j < 5000; j++) {
				int product_1 = checkS(i, j);
				sum += product_1;
			}
		}
		
		for(int m = 11; m < 100; m++) {
			for(int n = 101; n < 910; n++) {
				int product_2 = checkD(m, n);
				sum += product_2;
			}
		}
		System.out.println("sum = " + sum);
	}
	
	private static int checkS(int a, int b) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList = numListInit();
		int tmp = a * b;
		if(tmp >= 10000) {
			return 0;
		} else {
			int t1 = a;
			if(!numList.contains(t1)) {
					return 0;
			} else {
				numList.remove(t1);
			}
			int t2 = b / 1000;
			if(!numList.contains(t2)) {
					return 0;
			} else {
				numList.remove(t2);
			}
			int t3 = (b - t2 * 1000) / 100;
			if(!numList.contains(t3)) {
					return 0;
			} else {
				numList.remove(t3);
			}
			int t4 = (b - t1 * 1000 - t2 * 100) / 10;
			if(!numList.contains(t4)) {
					return 0;
			} else {
				numList.remove(t4);
			}
			int t5 = b - t1 * 1000 - t2 * 100 - t3 * 10;
			if(!numList.contains(t5)) {
					return 0;
			} else {
				numList.remove(t5);
			}
			return tmp;
		}
	}
	
	private static int checkD(int a, int b) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList = numListInit();
		int tmp = a * b;
		if(tmp >= 10000) {
			return 0;
		} else {
			int t1 = a / 10;
			if(!numList.contains(t1)) {
					return 0;
			} else {
				numList.remove(t1);
			}
			int t2 = a - t1 * 10;
			if(!numList.contains(t2)) {
					return 0;
			} else {
				numList.remove(t2);
			}
			int t3 = b / 100;
			if(!numList.contains(t3)) {
					return 0;
			} else {
				numList.remove(t3);
			}
			int t4 = (b - t3 * 100) / 10;
			if(!numList.contains(t4)) {
					return 0;
			} else {
				numList.remove(t4);
			}
			int t5 = b - t3 * 100 - t4 * 10;
			if(!numList.contains(t5)) {
					return 0;
			} else {
				numList.remove(t5);
			}
			return tmp;
		}
	}
	
	private static ArrayList<Integer> numListInit() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++) {
			list.add(i);
		}
		return list;
	}	
}