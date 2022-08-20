public class LastEvenIndex {
  static int lastEvenIndex(int[] a) {
    int index = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0)
        index = i;
    }
    return index;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 9, 7, 6, 10 };
    int result = lastEvenIndex(arr);
    System.out.println(result);
  }
}
