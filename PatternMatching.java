public class PatternMatching {
  private static int isMatching(int[] a, int len, int[] pattern, int patternLength) {
    int i = 0;
    int p = 0;
    int match = 0;

    for (i = 0; i < len; i++) {
      if (a[i] == pattern[p])
        match++;
      else if (match == 0 || p == patternLength - 1)
        return 0;
      else {
        p++;
        if (a[i] != pattern[p])
          return 0;
        else
          match++;
      }
    }
    if (i == len && p == patternLength - 1)
      return 1;

    return 0;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 1, 2, 3 };
    int[] arr2 = { 1, 2, 3 };
    int result = isMatching(arr1, arr1.length, arr2, arr2.length);
    System.out.println(result);
  }
}
