public class NormalNumber {
  static int isNormalNumber(int n) {
    int divider = 2;
    while (divider < n) {
      if (n % divider == 0 && divider % 2 != 0)
        return 0;
      divider++;
    }
    return 1;
  }

  public static void main(String[] args) {
    int result = isNormalNumber(5);
    System.out.println(result);
  }
}
