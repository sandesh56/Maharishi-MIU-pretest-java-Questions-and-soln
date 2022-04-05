public class DigitSum {
  static int digitSum(int digit, int n) {
    int sum = 0;
    while (digit > 0) {
      int rem = digit % 10;
      sum += rem;
      if (sum >= n)
        return 0;
      digit /= 10;
    }
    return 1;
  }

  public static void main(String[] args) {
    int result = digitSum(562200, 15);
    System.out.println(result);
  }
}
