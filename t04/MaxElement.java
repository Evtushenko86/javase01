import java.util.Random;

public class MaxElement {

  void findMaxElement (int n) {
    double[] arrayNumbers = new double[2 * n];
    for (int i = 0; i < arrayNumbers.length; i++) {
      arrayNumbers[i] = Math.random() * 2;
    }
    //  double[] arrayNumbers = {2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 100.0, 5.0, 4.0, 10.0};


    double[] arrayValues = new double[n];
    int x = 0;
    for (int i = 0; i < arrayValues.length; i++) {
      arrayValues[i] = arrayNumbers[i] + arrayNumbers[2 * n + x - 1];
      x--;
    }
    double maxValues = arrayValues[0];

    for (int i = 1; i < arrayValues.length; i++) {
      if (arrayValues[i] > maxValues)
        maxValues = arrayValues[i];
    }
    System.out.println("Max =" + maxValues);
  }
  public static void main (String[] args) {
    MaxElement test = new MaxElement();
   // test.findMaxElement(Integer.parseInt(args[0]));
    test.findMaxElement(5);
  }
}
