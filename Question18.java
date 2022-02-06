package practicequestion;
/*
Happy Number

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */
public class Question18 {
    public static void main(String[] args) {
        int n =19;
        System.out.println(isHappy(n));
    }

    public static  boolean isHappy(int n) {
        int slow =n;
        int fast = n;
        do{
            //we are doing this slow and fast method because any number gets repeats after a particular
            // set of doing square process on it
            //So to exit from this endless loop we are applying slow and fast method over here
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        return slow == 1;
    }
    public static int findSquare(int n){
        int ans =0;
        while(n>0){
            int rem = n%10;
            ans +=rem*rem;
            n /=10;

        }
        return ans;
    }
}
