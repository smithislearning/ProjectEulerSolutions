public class Special_Pythagorean_triplet{
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (a = 1; a < 500; a++){
			for (b = a + 1; b < 1000; b++){
				double aDouble = (double)a;
				double bDouble = (double)b;
				double cDouble = (double)c;
				double cSquare = Math.pow(aDouble, 2.0) + Math.pow(bDouble, 2.0);
				cDouble = Math.sqrt(cSquare);
				if(cDouble == Math.floor(cDouble)) {
					c = (int)cDouble;
					if(a + b + c == 1000) {
						System.out.println(a * b * c);
						break;
					} else {
						continue;
					}
				}
			}
		}
	}
}