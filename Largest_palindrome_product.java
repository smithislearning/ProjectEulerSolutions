import java.util.ArrayList;

public class Largest_palindrome_product{
	public static void main(String[] args){
		int a, b, c;
		ArrayList<Integer> i = new ArrayList<Integer>();
		ArrayList<Integer> j = new ArrayList<Integer>();
		

		for(a = 999; a > 100; a--){
			for(b = 999; b > 100; b--){
				c = a*b;
				i.add(c/100000);
				i.add((c - i.get(0)*100000)/10000);
				i.add((c - i.get(0)*100000 - i.get(1)*10000)/1000);
				i.add((c - i.get(0)*100000 - i.get(1)*10000 - i.get(2)*1000)/100);
				i.add((c - i.get(0)*100000 - i.get(1)*10000 - i.get(2)*1000 - i.get(3)*100)/10);
				i.add(c - i.get(0)*100000 - i.get(1)*10000 - i.get(2)*1000 - i.get(3)*100 - i.get(4)*10);
				
				for(int m = 0; m < i.size() - 1; m++){
					if(i.get(0) == 0){
						i.remove(0);
					}
				}
				
				
				for(int k = i.size() - 1; k >= 0; k--){
					j.add(i.get(k));
				}
				
				if(i.equals(j)){
					System.out.println(c);
					i.clear();
					j.clear();
					break;
				} else {
					i.clear();
					j.clear();
					continue;
				}
			}
		}
	}
}