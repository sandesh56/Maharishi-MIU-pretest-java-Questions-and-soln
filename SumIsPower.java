public class SumIsPower {
  static boolean isSumIsPower(int[] a) {
    if (a.length < 1)
      return false;
    int sum = 0;
    for (int item : a) {
      sum += item;
    }
    int power = 0;
    while (true) {
      double newNum = Math.pow(2, power);
      if (newNum == sum)
        return true;
      else if (newNum > sum)
        break;
      power++;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 1 };
    boolean result = isSumIsPower(arr);
    System.out.println(result);
  }
}
