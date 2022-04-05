public class NormalNumber72 {
  static int isNormalNumber(int n) {
    if (n < 0)
      return 0;
    int divider = 2;
    int oddFactorCount = 0;
    while (divider <= n / 2) {
      if (n % divider == 0 && divider % 2 != 0) {
        oddFactorCount++;
      }
      if (oddFactorCount > 0)
        return 0;
      divider++;
    }
    return 1;
  }

  public static void main(String[] args) {
    int result = isNormalNumber(6);
    System.out.println(result);
  }
}
