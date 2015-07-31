import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

enum Letters {
	A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8), I(9), J(10), K(11),
	L(12), M(13), N(14), O(15), P(16), Q(17), R(18), S(19), T(20), U(21),
	V(22), W(23), X(24), Y(25), Z(26);
	
	private int value;
	
	private Letters(int value) {
		this.value = value;
	}
	
	public static int getValue(char inChar) {
		String tmp = Character.toString(inChar);
		Letters temp = valueOf(tmp);
		return temp.value;
	}
}

class Names {
	public String[] names;
	private int length = 0;
	
	public Names() throws IOException{
		this.names = inputNames();
		this.length = names.length;
	}
	
	private String[] inputNames() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("p022_names.txt"));
		String line = null;
		String [] values = null;
		
		while ((line = br.readLine()) != null) {
			values = line.split(",");
		}
		br.close();
		return values;
	}
	
	public String getNames(int num) {
		return names[num];
	}
	
	public int getLength() {
		return length;
	}
}


public class Names_Scores {
	
	private static ArrayList<Integer> valueArrayList = new ArrayList<Integer>(1);
	private static ArrayList<String> nameArrayList = new ArrayList<String>(1);
	
	
	private static int compare(int midposition, char[] a, char[] b) {
		int position = midposition;
		int capacity = (a.length > b.length) ? b.length : a.length;
		for(int i = 1; i< capacity - 1; i++) {
			if(Letters.getValue(a[i]) == Letters.getValue(b[i])) {
				if(i == capacity - 2 && a.length > b.length) {
					position = midposition + 1;
					break;
				} else {
					continue;
				}
			} else if(Letters.getValue(a[i]) < Letters.getValue(b[i])) {
				break;
			} else {
				position = midposition + 1;
				break;
			}
		}
		return position;
	}
	
	private static void nameSort(String aName, ArrayList arrayList, int startIndex, int endIndex){
		int posIndex = 0;
		int relativeMid = (endIndex - startIndex)/2;
		int midIndex = startIndex + relativeMid;
		char[] tmp1 = aName.toCharArray();
		char[] tmp2 = ((String)arrayList.get(midIndex)).toCharArray();
		int nameLength = aName.length();
		int midLength = ((String)arrayList.get(midIndex)).length();
		
		posIndex = compare(midIndex, tmp1, tmp2);
		
		if(relativeMid > 0) {
			if(posIndex <= midIndex) {
				nameSort(aName, arrayList, startIndex, midIndex);
			} else {
				nameSort(aName, arrayList, midIndex, endIndex);
			}
		} else {
			if(posIndex == endIndex) {
				char[] endOb = ((String)arrayList.get(endIndex)).toCharArray();
				posIndex = compare(endIndex, tmp1, endOb);
				nameArrayList.add(posIndex,aName);
			} else {
				posIndex = compare(midIndex, tmp1, tmp2);
				nameArrayList.add(posIndex, aName);
			}
		}
	}
	
	private static int worthCalc(String nameIn) {
		char[] tmp = nameIn.toCharArray();
		int worth = 0;
		
		for (int j = 1; j < nameIn.length() - 1; j++) {
			worth += Letters.getValue(tmp[j]);
		}
		return worth;
	}
	
	private static void nameSortScore(String[] nameInput) {
		nameArrayList.add(nameInput[0]);
		for(String c : nameInput) {
			if(Arrays.asList(nameInput).indexOf(c) == 0) {
				continue;
			} else {
				nameSort(c, nameArrayList, 0, nameArrayList.size() - 1);
			}
		}
		
		for(int x = 0; x < nameArrayList.size(); x++) {
			int tmpWorth = worthCalc(nameArrayList.get(x));
			int score = (x + 1) * tmpWorth;
			valueArrayList.add(x, score);

		}
	}
	
	private static long scoreSum() {
		long sum = 0L;
		for(int n : valueArrayList){
			sum += (long) n;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		Names a = new Names();
		
		long totalScore = 0L;
		
		nameSortScore(a.names);
		
		totalScore = scoreSum();

		System.out.println("total score of all names is " + totalScore);

		
	}	
}
