import java.util.ArrayList;

public class LexicographicPermutations {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> arrange = new ArrayList<Integer>();
		{
			for(int a = 0; a < 10; a++) {
				list.add(a);
			}
			System.out.println("original list is: \n" + list);
		}
		
		int st = 1000000;
		int x = 0;
		int i = 0;
		int j = 0;
		int index = 0;
		for(i = 9; i > 0; i--) {
			int y = 1;
			for(j = i; j > 0; j--) {
				y *= j;
				
			}
			x = (int) Math.ceil((float)st / (float)y);
			st = st % y;
			if(st == 0)
				st = y;
			
			if(x >= list.size()) 
				x = list.size();
			
			index = x - 1;
			arrange.add(list.get(index));
			list.remove(index);
		}
		arrange.add(list.get(0));
		System.out.println("the one millionth arrangment is: \n" + arrange);
	}
}