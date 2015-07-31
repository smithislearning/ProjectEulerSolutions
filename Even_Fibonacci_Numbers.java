

public class Even_Fibonacci_Numbers{
	private static long num1 = 1;
	private static long num2 = 2;
	private static long num3, sum;
	private static long cap = 4000000;
	
	
	public static void main(String[] args){
		sum += num2;
		while (num1 < cap && num2 < cap && num3 < cap)
		{
			num3 = num1 + num2;
			if(num3 > cap){
				break;
			} else if((num3 % 2) == 0){
				sum += num3;
			}
			num1 = num2 + num3;
			if (num1 > cap){
				break;
			} else if((num1 % 2) == 0){
				sum += num1;
			}
			num2 = num3 + num1;
			if (num2 > cap){
				break;
			}else if((num2 % 2) == 0){
				sum += num2;
			}
		}
		System.out.println(sum);
	}
}