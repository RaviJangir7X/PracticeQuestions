package practicequestion;
/*
Question 7 : Java Program to find the sum of each row and each column of a matrix
Link : https://www.javatpoint.com/java-program-to-find-the-sum-of-each-row-and-each-column-of-a-matrix
 */
public class Question7 {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        //Sum of each row
        for (int i = 0; i <matrix.length; i++) {
            int sum =0;
            for (int j = 0; j <matrix[i].length ; j++) {
                sum +=matrix[i][j];
            }
            System.out.println("Sum of " + i + " " + "row is: " + sum);

        }
        //Sum of each column
        for (int i = 0; i <matrix.length; i++) {
            int sum =0;
            for (int j = 0; j <matrix[i].length ; j++) {
                sum +=matrix[j][i];
            }
            System.out.println("Sum of " + i + " " + "column is: " + sum);

        }
    }
}
/*
Output :
Sum of 0 row is: 6
Sum of 1 row is: 15
Sum of 2 row is: 24
Sum of 0 column is: 12
Sum of 1 column is: 15
Sum of 2 column is: 18
*/