



public class Sum_square_difference{
	public static void main(String[] args){
		
		int m = 0, n = 0;
		
		for(int i = 1; i <= 100; i++){
			m += i;
			n += i*i;
		}
		m = m*m;
		
		System.out.println(m - n);
	}
}