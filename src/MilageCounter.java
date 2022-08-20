import java.util.*;

public class MilageCounter {
  static int[] updateMilage(int[] a, int mile) {
    String digit = "";
    for (int i = a.length - 1; i >= 0; i--) {
      if (digit.length() == 0 && a[i] == 0) {
        digit = "";
      } else {
        digit += a[i];
      }
    }

    int updatedMilage = Integer.parseInt(digit) + mile;
    String updatedString = Integer.toString(updatedMilage);
    int arrayLength;
    if (updatedString.length() > 9) {
      arrayLength = 9;
    } else if (updatedString.length() > digit.length()) {
      arrayLength = updatedString.length();
    } else {
      arrayLength = a.length;
    }
    int[] updatedArray = new int[arrayLength];

    for (int i = updatedString.length() - 1, index = 0; i >= 0 && index < updatedArray.length; i--, index++) {
      updatedArray[index] = Integer.parseInt(String.valueOf(updatedString.charAt(i)));

    }
    return updatedArray;

  }

  public static void main(String[] args) {
    int[] arr = { 9, 9, 9, 9, 9 };
    int[] result = updateMilage(arr, 1);
    System.out.println(Arrays.toString(result));
  }
}
