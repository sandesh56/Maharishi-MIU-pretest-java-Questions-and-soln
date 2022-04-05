
public class StackNumber {
	
	private static int isStaticNumber(int n) {
		// return 0 if negative
		if(n < 0) return 0;
		int sum = 0;
		int currentNum = 1;
		
		while(currentNum >= n) {
			sum += currentNum;
			
			if(sum == n)return 1;
			
			if(sum > n) break;
			currentNum++;
		}
		return 0;
	}
	
   public static void main(String[] args) {
	   System.out.println(isStaticNumber(1));
   }

}
