
class Amstrong {

  static int checkAmstrongNumber(int n) {
    int count = 0;
    int temp = n;
    while (temp > 0) {
      count++;
      temp /= 10;

    }

    temp = n;
    int sum = 0;
    while (temp > 0) {
      int rem = temp % 10;
      int tempNum = 1;
      int c = count;
      while (c > 0) {
        tempNum *= rem;
        c--;
      }
      sum += tempNum;
      temp /= 10;

    }
    if (n == sum)
      return 1;
    else
      return 0;

  }

  public static void main(String[] args) {
    int result = checkAmstrongNumber(-371);
    System.out.println(result);
  }

}