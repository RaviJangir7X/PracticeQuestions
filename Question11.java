package practicequestion;
/*
Question : Java Program to determine whether one string is a rotation of another
Link : https://www.javatpoint.com/java-program-to-determine-whether-one-string-is-a-rotation-of-another
*/
public class Question11 {
    public static void main(String[] args) {
        String string1 = "ravi";
        String string2 ="vira";
        if(string1.length()!=string2.length()){
            return;
        }
        String checkString = string1+string1;
        if(checkString.contains(string2)){
            System.out.println("String is a rotation of another");
        }
    }
}
/*
String is a rotation of another
 */
