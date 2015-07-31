import java.math.BigInteger;

public class Power_digit_sum{
	
	private static int length = 0;
	private static int digit = 0;
	private static int sum = 0;
	private static char tmp = '0';
	
	public static void main(String[] args) {
		String bigDec = BigInteger.valueOf(2).pow(1000).toString(); 
		System.out.println("The number in decimal is " + bigDec);
		System.out.println("It's length is " + bigDec.length());
		for (int i = 0; i < bigDec.length(); i++) {
			sum += Character.getNumericValue(bigDec.charAt(i));
		}
		System.out.println("Sum of all the digits is: " + sum);
	}
}