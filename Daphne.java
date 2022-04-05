public class Daphne {
  static int isDaphne(int[] a) {
    boolean evenFalg = false;
    for (int i = 0; i < a.length; i++) {
      if (i == 0 && a[i] % 2 == 0)
        evenFalg = true;
      if (evenFalg) {
        if (a[i] % 2 != 0)
          return 0;
      } else {
        if (a[i] % 2 == 0)
          return 0;
      }
    }

    return 1;
  }

  public static void main(String[] args) {
    int arr[] = {};
    int result = isDaphne(arr);
    System.out.println(result);
  }
}
