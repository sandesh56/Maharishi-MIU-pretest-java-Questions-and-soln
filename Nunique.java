public class Nunique {
  static int isNunique(int[] a, int n) {
    if (a.length < 2)
      return 0;
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] + a[j] == n)
          count++;
      }
    }
    if (count != 1)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 7, 3, 3, 2, 4 };
    int result = isNunique(arr, 6);
    System.out.println(result);
  }
}
