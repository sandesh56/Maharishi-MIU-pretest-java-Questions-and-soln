
public class MinMaxDisjoint {
	
	private static int isMinMaxDisjoint(int[] a) {
		
		if(a.length == 0) return 0;
		int minCount = 0;
		int maxCount = 0;
		int maxIndex = 0;
		int minIndex = 0;
		int min = a[0];
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				maxIndex = i;
			}
			if(a[i] < min) {
				min = a[i];
				minIndex = i;
			}
		}
		
		for(int j = 0; j < a.length; j++) {
			if(a[j] == max) {
				maxCount++;
			}
			if(a[j] == min) {
				minCount++;
			}
		}
		
		if(Math.abs(maxIndex - minIndex) == 1) return 0;
		if(maxCount >1 || minCount > 1) return 0;
		if(max == min) return 0;
		
		return 1;
		
		
	}
	
	public static void main(String[] args) {
	    int[] arr = {18,1};
		int result = isMinMaxDisjoint(arr);
		System.out.println(result);
	}

}
