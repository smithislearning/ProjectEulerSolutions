import java.util.ArrayList;


public class a10001st_prime{
	public static void main(String[] args){
		
		int c = 0;
		int l = 0;
		int j = 0;
		int k = 0;
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);
		primeList.add(3);
		for(int i = 4; ; i++){
			for (j = primeList.size(); j > 0; j--){
				k = primeList.get(j - 1);
				l = i % k;
				if (l == 0){
					break;
				} else {
					continue;
				}
			}
			if (l != 0 && primeList.size() <= 10001){
				primeList.add(i);
				continue;
			} else if(primeList.size() == 10001){
				System.out.println("10001st prime is " + primeList.get(primeList.size() - 1));
				break;
			} else {
				continue;
			}
		}
	}
}