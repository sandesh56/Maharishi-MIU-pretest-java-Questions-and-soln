public class MadhavArray {
  static int isMadhav(int[] a) {
    if (a.length == 0)
      return 0;
    int n = 1;
    while (true) {
      int num = n * (n + 1) / 2;
      if (num == a.length)
        break;
      else if (num > a.length)
        return 0;
      n++;
    }
    int comparator = a[0];
    int index = 0;
    for (int i = 1; i <= n; i++) {
      int len = 0;
      int sum = 0;
      while (len < i) {
        sum += a[index];
        index++;
        len++;
      }
      if (sum != comparator)
        return 0;

    }
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 6, 2, 4, 2, 2, 2, 1, 15, 0, 0 };
    int result = isMadhav(arr);
    System.out.println(result);
  }
}
