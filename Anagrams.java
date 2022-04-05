public class Anagrams {

  private static int isAnagramsSortingMethod(char[] a, char[] b) {
    if (a.length != b.length)
      return 0;

    char[] copy1 = new char[a.length];
    char[] copy2 = new char[b.length];

    for (int i = 0; i < a.length; i++) {
      copy1[i] = a[i];
      copy2[i] = b[i];
    }

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (copy1[i] == copy2[j]) {
          copy1[i] = '-';
          copy2[j] = '-';
          break;
        }
      }
    }

    for (int k = 0; k < a.length; k++) {
      if (copy1[k] != '-' || copy2[k] != '-')
        return 0;
    }
    return 1;

  }

  public static void main(String[] args) {
    char arr1[] = {};
    char arr2[] = {};
    int result = isAnagramsSortingMethod(arr1, arr2);
    System.out.println(result);
  }
}
