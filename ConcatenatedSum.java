public class ConcatenatedSum {

  private static int checkConcatenatedSum(int n, int catlen) {

    int sum = 0;
    int number = n;
    while (number > 0) {
      int repeatedDigit = 0;
      int remiander = number % 10;
      int len = catlen;
      while (len > 0) {
        repeatedDigit = repeatedDigit * 10 + remiander;
        len--;
      }
      sum += repeatedDigit;
      number /= 10;
    }
    if (sum == n)
      return 1;
    return 0;

  }

  public static void main(String[] args) {
    int result = checkConcatenatedSum(13332, 4);
    System.out.print(result);
  }

}
