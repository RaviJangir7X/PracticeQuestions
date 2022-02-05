package practicequestion;

import java.util.Arrays;
import java.util.Scanner;

/*
Question : Java Program to determine whether two strings are the anagram
Link : https://www.javatpoint.com/java-program-to-determine-whether-two-strings-are-the-anagram
*/
public class Question10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string");
        String string1 =s.next();
        System.out.println("Enter second string");
        String string2 =s.next();
        if(string1.length()!=string2.length()){
            System.out.println("They are not anagram");
            return;
        }
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i <array1.length ; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("They are not anagram");
                return;
            }
        }
        System.out.println("They are anagram !!");

    }
}
/*
Enter first string
ravi
Enter second string
ivar
They are anagram !!
*/
