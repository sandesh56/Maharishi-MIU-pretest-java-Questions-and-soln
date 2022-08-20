
public class TrivalentArray {

	public static int is_trivalent(int[] arr) {

		int[] flagArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int subractor = 0;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					subractor = 1;
					break;
				}
			}

			flagArray[i] = 1 - subractor;
		}

		int sum = 0;
		for (int i = 0; i < flagArray.length; i++) {
			sum += flagArray[i];
		}

		if (sum == 3)
			return 1;

		return 0;

	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 8, 8, 8, 7, 7, 7, 9, 9 };
		int result = is_trivalent(arr);
		System.out.println(result);
	}

}

// public class Main
// {
// public static int is_trivalent(int[] arr){
// int[] integer_flag = new int[arr.length];
//
// for (int i=0; i<arr.length; i++) {
// int ith_found = 0;
// for (int j=0; j<i; j++) {
// if (arr[i] == arr[j]){
// ith_found = 1;
// break;
// }
// }
//
// integer_flag[i] = 1-ith_found;
// }
//
// int sum = 0;
// for (int i=0;i<arr.length;i++) {
// sum += integer_flag[i];
// }
//
// if (sum == 3) {
// return 1;
// }
// return 0;
// }
// public static void main(String[] args) {
// int[] arr = {5, 8, 5, 5, 7, 7, 9};
// int result = is_trivalent(arr);
// System.out.println(result);
// }
// }
