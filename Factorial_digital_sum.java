import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Factorial_digital_sum{
	
	private static BigInteger multip(BigInteger keyIn) {
		BigInteger y = keyIn;
		
		while(y.intValue() > 1) {
			y = y.subtract(BigInteger.ONE);
			keyIn = keyIn.multiply(y);
		}
		return keyIn;
	}
	
	private static int digitSum(BigInteger digit) {
		int z = 0;
		while (digit != BigInteger.ZERO) {
			z += digit.remainder(BigInteger.TEN).intValue();
			digit = digit.divide(BigInteger.TEN);
		}
		return z;
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("Please give me a number to work on.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rad = br.readLine();
		System.out.println("The number to work on is " + rad + ".");
		BigInteger read = new BigInteger(rad);
		System.out.println("read = " + read.toString());
		long result = digitSum(multip(read));
		System.out.println("Factorial of " + rad + " is " + multip(read).toString());
		System.out.println("Sum of digits of factorial of " + rad + " is: " + Long.toString(result));
	}
}