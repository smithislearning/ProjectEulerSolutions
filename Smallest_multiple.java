import java.util.ArrayList;


public class Smallest_multiple{
	public static void main(String[] args){
		int c = 0;
		ArrayList<Integer> checkList = new ArrayList<Integer>();
		
		for(int i = 4; ; i++){
			for(int k = 1; k <= 20; k++){
				if(i % k != 0){
					c = 0;
					checkList.add(c);
				} else {
					c = 1;
					checkList.add(c);
				}
			}
			
//			System.out.println(checkList.toString());
//			break;
			if(checkList.contains(0)){
				checkList.clear();
				continue;
			} else {
				System.out.println(i);
				break;
			}
		}
	}
}