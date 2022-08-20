public class FactorTwoCount {
  static int factorTwoCount(int n) {
    double num = n;
    int count = 0;
    while (num > 0) {
      if (num % 2 == 0)
        count++;
      num /= 2;
    }
    return count;
  }

  public static void main(String[] args) {
    int result = factorTwoCount(17);
    System.out.println(result);
  }
}
