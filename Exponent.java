
public class Exponent {
	
	private static int getExponent(int n,int p) {
		
		if(p <= 1) return -1;
		int power = 0;
		int latestPower = 0;
		
		while(power <= Math.abs(n)) {
			double divider = Math.pow(p,power);
			
			if(divider < Math.abs(n)) {
				double quotient = Math.abs(n / divider);
				
				if(quotient % 2 == 0) {
					latestPower = power;
				}
			}else {
				break;
			}
			power++;
		}
	return latestPower;

}
	public static void main(String[] arg) {
		int result = getExponent(128,4);
		System.out.println(result);
	}
}
