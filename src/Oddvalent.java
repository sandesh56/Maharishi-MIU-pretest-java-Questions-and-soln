public class Oddvalent {
  static int isOddValent(int[] a) {
    int oddCount = 0;
    int equalCount = 1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0)
        oddCount++;
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j])
          equalCount++;
      }
      if (oddCount > 0 && equalCount > 1)
        return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 3 };
    int result = isOddValent(arr);
    System.out.println(result);
  }
}
