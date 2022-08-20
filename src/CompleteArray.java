public class CompleteArray {
  static int isSquare(int n) {
    if (n < 0)
      return 0;

    int num = 0;
    while (true) {
      int square = num * num;
      if (square == n)
        return 1;
      else if (square > n)
        break;
      num++;
    }
    return 0;
  };

  static int isCompleteArray(int[] a) {
    boolean hasEven = false;
    boolean hasPerfectSquare = false;
    for (int i = 0; i < a.length; i++) {
      if (i == 0) {
        int num = 0;
        while (num < a.length) {
          if (a[num] % 2 == 0) {
            hasEven = true;
          }
          if (isSquare(a[num]) == 1) {
            hasPerfectSquare = true;
          }
          if (hasEven && hasPerfectSquare)
            break;
          num++;
        }
      }
      if (hasEven && hasPerfectSquare) {
        for (int j = 0; j < a.length; j++) {
          if (i != j && a[i] + a[j] == 8) {
            return 1;
          } else if (j == a.length - 1)
            return 0;
        }
      } else {
        return 0;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] arr = { 16 };
    int result = isCompleteArray(arr);
    System.out.println(result);
  }

}
