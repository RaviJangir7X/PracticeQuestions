package practicequestion;
/*
Question : Java Program to determine whether a given matrix is an identity matrix
Link : https://www.javatpoint.com/java-program-to-determine-whether-a-given-matrix-is-an-identity-matrix

Explanation : A matrix is said to be an identity matrix if it is a square matrix in which elements of
principle diagonal are ones, and the rest of the elements are zeroes.
 */
public class Question8 {
    public static void main(String[] args) {
        int[][] matrix ={{1,0,0},{0,1,0},{0,0,1}};
        int flag =0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(i==j && matrix[i][j]!=1){
                    flag=1;
                }else if (i!=j && matrix[i][j]!=0){
                    flag=1;

                }
            }
        }
        if(flag==0){
            System.out.println("Identity matrix");
        }else{
            System.out.println("Not an identity matrix ");
        }

    }
}
/*
*Output :
Identity matrix
* */
