
public class FullnessQuotient {
	private static int fullnessQuotient(int num) {
		if( num < 1) return -1;
		int count = 0;
		int baseNumber = 2;
		while(baseNumber <= 9) {
			String baseDigits = "";
			int n = num;
			while(n > 0) {
				String remainder = Integer.toString(n % baseNumber);
				baseDigits += remainder;
				n /= baseNumber;
			}
			
			if(baseDigits.indexOf("0") == -1) count++;
			baseNumber++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int result = fullnessQuotient(360);
		System.out.println(result);
	}
	
}

