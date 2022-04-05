public class Henry {
  static int henry(int i, int j) {
    if (j < i)
      return 0;
    int firstPerfect = 0;
    int secondPerfect = 0;
    int n = 6;
    int count = 0;
    while (count < j) {
      int divider = 1;
      int sum = 0;
      while (divider <= n / 2) {
        if (n % divider == 0) {
          sum += divider;
        }
        divider++;
      }
      if (sum == n) {
        count++;
        if (count == i)
          firstPerfect = n;
        if (count == j)
          secondPerfect = n;
      }

      n++;
    }
    System.out.println(firstPerfect + " " + secondPerfect);
    return firstPerfect + secondPerfect;
  }

  public static void main(String[] args) {
    int result = henry(1, 4);
    System.out.println(result);
  }
}
