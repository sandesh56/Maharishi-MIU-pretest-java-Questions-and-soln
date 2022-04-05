public class FactorEqual {
  static int hasFatorEqal(int n, int m) {
    int factorN = 1;
    int factorM = 1;
    int divider = 1;
    while (divider <= n / 2) {
      if (n % divider == 0) {
        factorN++;
      }
      divider++;
    }
    divider = 1;
    while (divider <= m / 2) {
      if (m % divider == 0) {
        factorM++;
      }
      divider++;
    }
    if (factorM == factorN)
      return 1;
    return 0;

  }

  public static void main(String[] args) {
    int result = hasFatorEqal(10, 20);
    System.out.println(result);
  }
}
