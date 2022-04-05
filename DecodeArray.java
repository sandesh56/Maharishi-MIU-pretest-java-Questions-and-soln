public class DecodeArray {
  static int decodeArray(int[] a) {
    if (a.length == 1)
      return 0;
    boolean isNegativeNum = false;
    int digit = 0;
    int zeroCount = 0;
    for (int i = 0; i < a.length; i++) {
      if (i == 0 && a[i] < 0)
        isNegativeNum = true;
      else {
        if (a[i] == 0) {
          zeroCount++;
        } else {
          digit = digit * 10 + zeroCount;
          zeroCount = 0;
        }
      }
    }
    if (isNegativeNum)
      return digit * -1;
    return digit;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 1, 1, 1, 1, 0, 1 };
    int result = decodeArray(arr);
    System.out.println(result);
  }
}
