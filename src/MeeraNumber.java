public class MeeraNumber {
  static int isMeeraNumber(int n) {
    int factorCount = 0;
    int divider = 2;
    while (divider <= n / 2) {
      if (n % divider == 0)
        factorCount++;
      divider++;
    }
    if (factorCount > 0 && n % factorCount == 0)
      return 1;
    return 0;
  }

  public static void main(String[] args) {
    int result = isMeeraNumber(21);
    System.out.println(result);
  }
}
