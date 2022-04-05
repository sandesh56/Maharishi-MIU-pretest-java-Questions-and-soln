public class MercurialArray {
  private static int isMercurial(int[] a) {
    if (a.length == 0)
      return 1;
    int firstOneIndex = -1;
    int secondOneIndex = -1;
    int threeIndex = -1;
    boolean foundOne = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        if (!foundOne) {
          firstOneIndex = i;
          foundOne = true;
        } else {
          secondOneIndex = i;
        }
      } else if (a[i] == 3) {
        threeIndex = i;
      }
      if (firstOneIndex < threeIndex && secondOneIndex > threeIndex)
        return 0;
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 3, 7, 1 };
    int result = isMercurial(arr);
    System.out.println(result);
  }
}
