package practicequestion;
import java.util.Scanner;
/*
 * Question 1:-Fibonacci series in Java
 * link :https://www.javatpoint.com/fibonacci-series-in-java
 * */

public class Question1 {
       public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int range = s.nextInt();
            int a =0;
            int b=1;
            for (int i = 0; i <range ; i++) {
                System.out.print(a + " ");
                int c = a+b;
                a=b;
                b=c;


            }
        }
    }
/*
* Output :
10
0 1 1 2 3 5 8 13 21 34
*/
