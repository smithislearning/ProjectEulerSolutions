

public class Multiples_of_3_and_5{
	
	private static int num, sum;
	
	public static void main(String[] args){
		
		for(num = 0; num < 1000; num++){
			if((num % 3) == 0){
				sum += num;
			} else if ((num % 5) == 0){
				sum += num;
			}
		}
		System.out.println(sum);
	}
}