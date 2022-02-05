package practicequestion;

import java.util.Scanner;

/*
Question 3: Peterson Number
Link : https://www.javatpoint.com/peterson-number-in-java
Explanation : A number is said to be Peterson if the sum of factorials of each digit
is equal to the sum of the number itself.
Example :
Number = 145
145 = !1 + !4 + !5

=1+4*3*2*1+5*4*3*2*1

=1+24+120

145=145
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum =0;
        int originalNumber = number;
        while (number>0){
            int lastDigit =number%10;
            int factorial =1;
            while (lastDigit>0){
                factorial *=lastDigit;
                lastDigit--;
            }
            sum+=factorial;
            number/=10;

        }
        if(originalNumber==sum){
            System.out.println("Peterson Number");
        }else{
            System.out.println("Not a Peterson Number");
        }
    }

}
/*
Output :
145
Peterson Number

200
Not a Peterson Number
 */
