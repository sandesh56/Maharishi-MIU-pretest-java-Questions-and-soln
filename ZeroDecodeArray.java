public class ZeroDecodeArray {

  private static Integer decodeArray(int[] a) {

    String digit = "";

    int zeroCount = 0;
    if (a[a.length - 1] != 1)
      return null;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == -1) {
        if (i == 0) {
          digit = "-";
        }
      }
      if (a[i] == 0) {
        zeroCount++;
      } else if (a[i] == 1) {
        digit += zeroCount;
        zeroCount = 0;
      }
    }
    return Integer.parseInt(digit);
  }

  public static void main(String[] args) {
    int arr[] = { 0, 1, 1, 1, 1, 1, 0, 1, 1 };
    int result = decodeArray(arr);
    System.out.println(result);
  }
}
