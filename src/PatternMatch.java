
public class PatternMatch {
	   private static int matches(int[] a, int[] p){
		
		   
		   int lowerBound = 0;
		   for(int i = 0; i < p.length; i++) {
			   int upperBound = lowerBound + Math.abs(p[i]);
			   
			   for(int j = lowerBound; j < upperBound; j++) {
				   if(p[i] > 0) {
					   if(a[j] < 0) return 0;
				   }
				   if(p[i] < 0) {
					   if(a[j] > 0) return 0;
				   }
				   lowerBound++;
			   }
		   }
		   return 1;
	    }
	    
		public static void main (String[] args) {
		    int[] arr =  {1, 2, 3, 5, -5, 2, 3, 18};
		    int[] p = {3,-2,3};
			System.out.println(matches(arr,p));
		}

}
