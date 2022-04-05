import java.util.Arrays;

public class Cluster {
	private static int[] clusterCompression(int[] a) {

		if (a.length == 0)
			return new int[] {};
		int clusterSize = 1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				clusterSize++;
			}
		}

		int[] clusterArray = new int[clusterSize];
		int index = 0;
		clusterArray[index] = a[0];
		for (int j = 0; j < a.length - 1; j++) {
			if (a[j] != a[j + 1]) {
				index++;
				clusterArray[index] = a[j + 1];
			}
		}

		return clusterArray;
	};

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 };
		int[] result = clusterCompression(arr);
		System.out.println(Arrays.toString(result));
	}

}
