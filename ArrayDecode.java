public class ArrayDecode {

  private static int decodeArray(int[] a) {

    if (a.length < 2)
      return 0;

    String digit = "";

    for (int i = 0; i < a.length - 1; i++) {
      int absSum = 0;
      if (i == 0) {
        if (a[i] < 0) {
          digit = "-";
        }
      }
      absSum = Math.abs(a[i] - a[i + 1]);
      digit += Integer.toString(absSum);
    }

    return Integer.parseInt(digit);
  }

  public static void main(String[] args) {
    int arr[] = { 1 };
    int result = decodeArray(arr);
    System.out.println(result);
  }
}
