
public class Array121 {
	private static int is121Array(int[] a) {
		if (a.length < 2)
			return 0;
		if (a[0] != 1 || a[a.length - 1] != 1)
			return 0;

		boolean twoStarted = false;
		for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
			if (a[i] == 2) {
				twoStarted = true;
			}
			if (twoStarted) {
				if (a[i] != 2 || a[j] != 2)
					return 0;
			} else {
				if (a[i] != 1 || a[j] != 1)
					return 0;
			}
		}
		if (!twoStarted)
			return 0;
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 1, 2, 2, 2, 1, 3, 1, 1 };
		int result = is121Array(arr);
		System.out.println(result);
	}

}
