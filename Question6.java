package practicequestion;
/*
Question 6: Java Program to display the lower triangular matrix
Link : https://www.javatpoint.com/java-program-to-display-the-lower-triangular-matrix
 */
public class Question6 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(j>i){
                    matrix[i][j]=0;
                }

            }

        }
        for(int[] i : matrix){
            for(int j :i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
Output :
1 0 0
4 5 0
7 8 9

*/