package practicequestion;
/*
Sorting the Sentence

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in sentence to their original positions "This1 is2 a3 sentence4", then remove the numbers
 */
public class Question13 {
    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(sentence));
    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] arr1 = new String[arr.length];
        for (String value : arr) {
            int k = value.length() - 1;
            int c = value.charAt(k) - '0';
            arr1[c - 1] = value.substring(0, k);
        }
        StringBuilder str = new StringBuilder(); //using stringBuilder as we are changing string always.
        for (String value : arr1) {
            str.append(value).append(" ");
        }
        return str.toString().trim();
    }
}
