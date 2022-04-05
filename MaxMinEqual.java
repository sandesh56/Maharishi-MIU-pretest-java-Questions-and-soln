public class MaxMinEqual {
  static int isMaxMinEqual(int[] a) {
    if (a.length < 2)
      return 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int item : a) {
      if (item > max)
        max = item;
      else if (item < min)
        min = item;
    }
    if (max == min)
      return 0;
    int maxCount = 0;
    int minCount = 0;
    for (int item : a) {
      if (max == item)
        maxCount++;
      else if (min == item)
        minCount++;
    }
    if (maxCount != minCount)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { -2, -4 };
    int result = isMaxMinEqual(arr);
    System.out.println(result);
  }
}
