public class MatchPattern {
  static int matchPattern(int[] a, int[] pattern) {
    int i = 0;
    int k = 0;
    int matches = 0;
    for (i = 0; i < a.length; i++) {
      if (a[i] == pattern[k])
        matches++;
      else if (matches == 0 || k == pattern.length - 1)
        return 0;
      else {
        k++;
        i--;
      }
    }
    if (i == a.length && k == pattern.length - 1)
      return 1;
    return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 7, 7, 7 };
    int arr2[] = { 1, 2, 1, 8 };
    int result = matchPattern(arr, arr2);
    System.out.println(result);
  }
}
