
public class PackedArray {
	private static int isPacked(int[] a) {
		if (a.length == 0)
			return 1;
		int j;
		for (int i = 0; i < a.length; i = j) {
			if (a[i] < 0)
				return 0;
			int count = 0;
			for (j = i; j < i + a[i]; j++) {
				if (a[i] != a[j])
					return 0;
			}
			for (int item : a) {
				if (item == a[i]) {
					count++;
				}
			}
			if (count > a[i])
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 2, 1, 3, 3, 3 };
		int result = isPacked(arr);
		System.out.println(result);
	}
}
