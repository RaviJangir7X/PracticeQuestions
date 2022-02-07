package practicequestion;

public class SpiralMatrix {
    public static void main(String[] args) {
          int n =7;
          int[][] matrix = new int[n][n];
          int squareLength = n;
          int number = 1;

          for (int i = 0; i < n/2 +1; i++) {

              //printing from left to right
              for (int j = 0; j < squareLength; j++) {
                matrix[i][i + j] = number++;
              }

              //printing from top to down
              for (int j = 1; j < squareLength; j++) {
                matrix[i + j][n - 1 - i] = number++;
              }

              //printing from right to left
              for (int j = squareLength - 2; j >=0; j--) {
                matrix[n - 1 - i][i + j] = number++;
              }

              //printing from down to top
              for (int j = squareLength - 2; j > 0; j--) {
                matrix[i + j][i] = number++;
              }

            squareLength -= 2;
          }

        for (int[] elements : matrix) {
            for (int element  : elements) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }
    }
}
/*
Output :
  1  2  3  4  5  6  7
 24 25 26 27 28 29  8
 23 40 41 42 43 30  9
 22 39 48 49 44 31 10
 21 38 47 46 45 32 11
 20 37 36 35 34 33 12
 19 18 17 16 15 14 13
*/
