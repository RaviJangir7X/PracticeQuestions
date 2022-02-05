package practicequestion;
/*
Question 12 : Java Program to find the First largest and First smallest word in a string.
Link : https://www.javatpoint.com/java-program-to-find-the-largest-and-smallest-word-in-a-string
*/
public class Question12 {
    public static void main(String[] args) {
        String string = "Our greatest glory is not in never falling, but in rising every time we fall";
        String largestString ="", smallestString ="";
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        String[] words = string.split(" ");
        for (String word : words) {
            int wordLength = word.length();
            if (wordLength > max) {
                max = wordLength;
                largestString = word;
            }
            if (wordLength < min) {
                min = wordLength;
                smallestString = word;
            }
        }
        System.out.println("First largest word is : " + largestString + "\n" + "First smallest word is : " + smallestString);
    }
}
/*
Output :
First largest word is : greatest
First smallest word is : is
*/