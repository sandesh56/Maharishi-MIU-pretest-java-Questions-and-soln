
public class RailroadTie {
	
	private static int isRailRoadTie(int[] a) {
		int nonZeroCount = 0;
		int l = a.length;
		if(a[0] == 0 || a[l-1]==0) return 0;
		for(int i = 1; i < l-1; i++) {
			
			if(a[i]>0 || a[i]<0) {
				nonZeroCount++;
				if(a[i-1] != 0 && a[i+1]!=0) return 0;
			}
			if(a[i] == 0) {
				if(a[i-1] == 0 || a[i+1] == 0) return 0;
			}
		}
		if(l>2 && nonZeroCount < 1) return 0;
		return 1;
	};
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int result = isRailRoadTie(arr);
		System.out.println(result);
	}
	

}
