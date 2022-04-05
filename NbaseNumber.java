public class NbaseNumber {
  static int nBaseInteger(int[] a, int n) {
    for (int i : a) {
      if (i > n)
        return 0;
    }
    int nBaseInteger = 0;
    for (int i = 0, power = a.length - 1; i < a.length; i++, power--) {
      nBaseInteger += a[i] * Math.pow(n, power);
    }
    return nBaseInteger;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 1, 1 };
    int result = nBaseInteger(arr, 2);
    System.out.println(result);
  }
}
