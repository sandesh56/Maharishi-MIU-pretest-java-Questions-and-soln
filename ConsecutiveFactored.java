public class ConsecutiveFactored {
  static int isConsecutiveFactorred(int n) {
    if (n <= 0)
      return 0;
    int divider = 2;
    while (divider < n) {
      if (n % divider == 0 && n % (divider + 1) == 0)
        return 1;
      divider++;
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isConsecutiveFactorred(6);
    System.out.println(result);
  }
}
