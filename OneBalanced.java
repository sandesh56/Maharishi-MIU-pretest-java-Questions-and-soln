public class OneBalanced {

  private static int isOneBalanced(int[] a) {
    if (a.length == 0)
      return 1;

    boolean nonZeroStarted = false;
    int oneCount = 0;
    int nonZeroCount = 0;
    int sequenceCount = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 1) {
        nonZeroCount++;
        if (!nonZeroStarted) {
          sequenceCount++;
        }
        nonZeroStarted = true;
      } else if (i == a.length - 1 && a[i] == 0)
        return 0;
      else if (a[i] == 1) {
        oneCount++;
        nonZeroStarted = false;
      }
    }
    if (oneCount != nonZeroCount || sequenceCount > 1)
      return 0;

    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
    int result = isOneBalanced(arr);
    System.out.println(result);
  }
}
