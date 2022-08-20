public class CubePowerful {

  private static int isCubePowerful(int n) {

    if (n <= 0)
      return 0;
    int sum = 0;
    int temp = n;

    while (temp > 0) {

      int remainder = temp % 10;
      sum += Math.pow(remainder, 3);
      temp /= 10;
    }
    if (sum == n)
      return 1;
    else
      return 0;
  }

  public static void main(String[] args) {
    int result = isCubePowerful(-81);
    System.out.println(result);
  }
}
