package practicequestion;
/*
* Question : Java Program to determine whether a given matrix is a sparse matrix
* Link : https://www.javatpoint.com/java-program-to-determine-whether-a-given-matrix-is-a-sparse-matrix
* Explanation : A matrix is said to be sparse matrix if most of the elements of that matrix are 0.
* It implies that it contains very less non-zero elements.
*
* */
public class Question9 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{0,0,0},{0,0,0}};
        int count =0;
        for (int[] i : matrix) {
            for (int j : i) {
                if (j == 0) {
                    count++;
                }
            }
        }
        if(count>matrix.length){
            System.out.println("Given matrix is sparse matrix");
        }
    }
}
/*
Given matrix is sparse matrix
*/
