
public class SumSafe {
	
	private static int isSumSafe(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		for(int j = 0; j < a.length; j++) {
			if(sum == a[j]) return 0;
		}
		
		return 1;
	}
	
	public static void main (String[] args) {
	    int[] arr =  {5,-2,1,5};
	    int[] p = {3,-2,3};
		System.out.println(isSumSafe(arr));
	}

}
