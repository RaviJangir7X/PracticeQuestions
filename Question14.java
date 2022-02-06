package practicequestion;
/*
Check if the Sentence Is Pangram

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
 */
public class Question14 {
    public static void main(String[] args) {
        String s ="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }


    public static  boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']=1;
        }
        for (int j : arr) {
            if (j == 0) {  //number of occurrences may be more than one for each character but it should not be 0
                return false;
            }
        }
        return true;
    }
}
