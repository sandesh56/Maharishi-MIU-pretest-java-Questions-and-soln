import java.util.*;

public class SetEqual {
  static int isSetEqual(int a[], int b[]) {
    if (a.length < 1 || b.length < 1)
      return 0;
    int[] copyA = new int[a.length];
    int[] copyB = new int[b.length];

    for (int i = 0, j = 0; i < a.length && j < b.length; i++, j++) {
      copyA[i] = a[i];
      copyB[j] = b[j];
    }
    System.out.println(Arrays.toString(copyA) + "   " + Arrays.toString(copyB));
    for (int i = 0; i < copyA.length; i++) {
      for (int j = 0; j < copyB.length; j++) {
        if (copyA[i] == copyB[j]) {
          copyA[i] = 0;
          copyB[j] = 0;
        }
      }
    }
    if (copyA.length < copyB.length) {
      for (int i : copyA) {
        if (i != 0)
          return 0;
      }
    } else if (copyA.length > copyB.length) {
      for (int i : copyB) {
        if (i != 0)
          return 0;
      }
    } else {
      for (int i = 0; i < copyA.length; i++) {
        if (copyA[i] != 0 || copyB[i] != 0)
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr1[] = { 1, 0, 1 };
    int arr2[] = { 1, 7, 1, 0 };
    int result = isSetEqual(arr1, arr2);
    System.out.println(result);
  }
}
