public class CompleteArray1 {
  static int isCompleteArray(int[] a) {
    if (a.length < 1)
      return 0;
    int maxEven = Integer.MIN_VALUE;
    int evenCount = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0)
        return 0;
      if (a[i] % 2 == 0) {
        evenCount++;
        if (a[i] > maxEven)
          maxEven = a[i];
      }

    }
    if (evenCount < 2)
      return 0;
    int maxCount = 0;
    for (int i : a) {
      if (maxEven == i)
        maxCount++;
    }
    if (maxCount > 1)
      return 0;
    int n = 2;
    while (n < maxEven) {
      boolean hasFlag = false;
      for (int i = 0; i < a.length; i++) {
        if (a[i] == n) {
          hasFlag = true;
          break;
        }
      }
      if (!hasFlag)
        return 0;
      n += 2;
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 4 };
    int result = isCompleteArray(arr);
    System.out.println(result);
  }
}
