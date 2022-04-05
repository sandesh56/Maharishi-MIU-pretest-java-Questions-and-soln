import java.util.Arrays;

public class SequentiallyBounded {

	private static int isSequentiallyBounded(int[] a) {
		if (a.length == 0)
			return 1;

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (a[i] < 0)
				return 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j])
					return 0;
				else if (a[i] == a[j]) {
					count++;
				}
			}
			if (count >= a[i])
				return 0;
		}
		return 1;

	}

	public static void main(String[] args) {

		int[] arr = { 0, 1 };
		int result = isSequentiallyBounded(arr);
		System.out.println(result);
	}

}
