
public class VanillaArray {

	private static int isVanilla(int[] a) {

		// base case
		if (a.length == 0)
			return 1;
		int digit = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				digit = Math.abs(a[i] % 10);
			}
			int num = Math.abs(a[i]);
			while (num > 0) {
				int rem = num % 10;
				if (rem != digit)
					return 0;
				num /= 10;
			}

		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 11111, 15111 };
		int result = isVanilla(arr);
		System.out.println(result);
	}

}
