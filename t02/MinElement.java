public class MinElement {

  public void findMinElement (double e){
    double[] array = new double[15];
    for (int i = 0; i < array.length; i++) {
      array[i] = ( 1.0 / ((i+2)*(i+2)));
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] < e) {
        int minElement = i + 1;
        System.out.println(minElement);
        for (int j = i; j < array.length; j++)
          System.out.println(array[j]);
        break;
      }
    }
  }
  public static void main (String[] args) {
    MinElement test = new MinElement();
    test.findMinElement(Double.parseDouble(args[0]));
  }
}