import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Largest_Prime_Factor{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader inBr = new BufferedReader(new InputStreamReader(System.in));
		String inStr = inBr.readLine();
		Long inNum = Long.parseLong(inStr);
		long prime;
		long i = 2;
		
		while(true){
			if(inNum % i == 0){
				if(inNum / i == 1){
					prime = i;
					System.out.println(prime);
					break;
				} else {
					inNum = inNum /i;
					prime = i;
					i++;
					System.out.println(prime);
					continue;
				}
			} else {
				i++;
			}
		}
	}
}