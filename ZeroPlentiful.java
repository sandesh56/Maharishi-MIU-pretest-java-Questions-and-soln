public class ZeroPlentiful {

  private static int isZeroPlentiful(int[] a) {

    // int totalCount = 0;
    // int tempCount = 0;
    // int i = 0;
    // for (i = 0; i < a.length; i++) {
    // if (a[i] == 0) {
    // totalCount++;
    // tempCount++;
    // if (i == a.length - 1 && tempCount < 4)
    // return 0;
    // } else if (tempCount > 0 && tempCount < 4)
    // return 0;
    // else {
    // tempCount = 0;
    // }
    // }
    // int result = totalCount / 4;
    // return result;
    int sequenceCount = 0;
    int j = 0;
    for (int i = 0; i < a.length; i = j) {
      int zeroCount = 0;
      for (j = i; j < a.length; j++) {
        if (a[j] == 0)
          zeroCount++;
        else if (zeroCount > 0 && a[j] != 0)
          break;
      }
      if (zeroCount > 0 && zeroCount < 4)
        return 0;
      else if (zeroCount >= 4)
        sequenceCount++;
    }
    return sequenceCount;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 0, 0 };
    int result = isZeroPlentiful(arr);
    System.out.println(result);
  }
}
