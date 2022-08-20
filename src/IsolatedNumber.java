
public class IsolatedNumber {
	private static int isIsolatedNumber(long n) {
		if(n > 2097151) return -1;
//		
//	    String square = Long.toString(n*n);
//		String cube = Long.toString(n*n*n);
//		
//		for(int first = 0; first < square.length(); first++) {
//			for (int second = 0; second < cube.length(); second++) {
//				if(square.charAt(first) == cube.charAt(second)) {
//					return 0;
//				}
//			}
//		}
		long square = (long)Math.pow(n,2);
		long cube = (long)Math.pow(n,3);
		
		while(square > 0 && cube > 0) {
			int sqDigit = (int)square % 10;
			int cubeDigit = (int)cube % 10;
			
			if(sqDigit == cubeDigit) return 0;
			square /= 10;
			cube /= 10;
		}
		
		return 1;
	}
	public static void main (String[] args) {
	    int[] arr =  {5,-2,1,5};
	    int[] p = {3,-2,3};
		System.out.println(isIsolatedNumber(163));
	}

}
