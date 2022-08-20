public class EvaluatePolynomial {
  static int eval(double x, int[] a) {
    int sum = 0;
    for (int i = a.length - 1; i >= 0; i--) {
      sum += a[i] * Math.pow(x, i);
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = {};
    int result = eval(10, arr);
    System.out.println(result);
  }
}
