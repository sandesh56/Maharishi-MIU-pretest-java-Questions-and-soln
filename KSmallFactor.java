public class KSmallFactor {
  static boolean hasKSmallFactor(int k, int n) {
    if (k < 0 || n < 0)
      return false;
    int divider = 1;
    while (divider <= n) {
      if (n % divider == 0) {
        int quotient = n / divider;
        if (divider < k && quotient < k)
          return true;
      }
      divider++;
    }
    return false;
  }

  public static void main(String[] args) {
    boolean result = hasKSmallFactor(6, 14);
    System.out.println(result);
  }
}
