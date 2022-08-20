public class DigitIncreasing {

  private static int isDigitIncreasing(int n) {
    int num = 1;
    while (num < 10) {
      int sum = 0;
      int tempNum = 0;
      while (true) {
        tempNum = tempNum * 10 + num;
        sum += tempNum;
        if (sum == n)
          return 1;
        else if (sum > n)
          break;
      }
      num++;
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isDigitIncreasing(2);
    System.out.println(result);
  }
}
