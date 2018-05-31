public class Matrix {
  void createMatrix (int n) {
    int[][] matrix = new int[n][n];
    int firstOne = 0;
    int lastOne = n - 1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if ((j == firstOne)||(j == lastOne))
          matrix[i][j] = 1;
        else
          matrix[i][j] = 0;
      }
      firstOne++;
      lastOne--;
    }
    for (int i = 0; i < matrix.length-1; i++) {
      for (int j = 0; j < matrix.length-1; j++) {
        System.out.print(matrix[i][j] + "    ");
      }
      System.out.println(matrix[i][n-1]);
    }
    for (int j = 0; j < matrix.length-1; j++) {
      System.out.print(matrix[n-1][j] + "    ");
    }
    System.out.print(matrix[n-1][n-1]);

  }
  public static void main (String[] args) {
    Matrix test = new Matrix();
    test.createMatrix(Integer.parseInt(args[0]));
    //test.createMatrix(5);
  }
}
