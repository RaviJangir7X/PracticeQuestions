package practicequestion;

import java.util.Scanner;

/*
* Question 2:Armstrong Number
* Link :https://www.javatpoint.com/armstrong-number-in-java
*
* Explanation : An Armstrong number is a positive m-digit number that is equal to the
* sum of the mth powers of their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number.
* Example:-
* 153: 13 + 53 + 33 = 1 + 125+ 27 = 153

125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
 * */
public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum =0,digitCount=0;
        int originalNumber = number;
        while (number>0){
            number /=10;
            digitCount++;

        }
        number=originalNumber;
        while (number>0){
            int lastDigit = number%10;
            sum += Math.pow(lastDigit,digitCount);
            number /=10;
        }
        if(originalNumber==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
/*
Output :
153
Armstrong Number

145
Not an Armstrong Number
*/
