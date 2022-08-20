public class OddHeavy {

	private static int isOddHeavy(int[] a) {
		if (a.length < 1)
			return 0;
		int oddCount = 0;
		for (int i : a) {
			if (i % 2 != 0) {
				oddCount++;
				for (int j : a) {
					if (j % 2 == 0) {
						if (j > i)
							return 0;
					}
				}
			}

		}
		if (oddCount < 1)
			return 0;
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 9, 7, 6, 10 };
		int result = isOddHeavy(arr);
		System.out.println(result);
	}

}
