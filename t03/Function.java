public class Function {
  void getFunction (double a, double b, double h) {
    int amountElements = (int) (1 + (b - a) / h);
    double[][] array = new double[amountElements][2];
    for (int i = 0; i < array.length; i++) {
      array[i][0] = a;
      array[i][1] = Math.tan(2 * a) - 3;
      a += h;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i][0] + "   " + array[i][1]);
    }
  }
  public static void main (String[] args) {
    Function test = new Function();
    //test.getFunction(1, 5, 0.15678);
    test.getFunction(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
  }
}
