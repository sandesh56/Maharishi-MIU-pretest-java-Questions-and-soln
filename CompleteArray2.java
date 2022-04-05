public class CompleteArray2 {
  static int isCompleteArray(int[] a) {
    if (a.length < 1)
      return 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int evenCount = 0;
    for (int i : a) {
      if (i % 2 == 0) {
        evenCount++;
        if (i > max) {
          max = i;
        }
        if (i < min) {
          min = i;
        }
      }
    }
    ;
    if (evenCount < 1 || min == max)
      return 0;
    int n = min + 1;
    while (n < max) {
      boolean hasValue = false;
      for (int item : a) {
        if (n == item)
          hasValue = true;
      }
      if (!hasValue)
        return 0;
      n++;
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 5 };
    int result = isCompleteArray(arr);
    System.out.println(result);
  }
}
