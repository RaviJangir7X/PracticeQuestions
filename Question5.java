package practicequestion;
/*
* Question : Java Program to find Third Largest Number in an Array
* Link : https://www.javatpoint.com/java-program-to-find-third-largest-number-in-an-array
* */
public class Question5 {
    public static void main(String[] args) {
        int[] arr = {2,6,4,4,2,5,1,9};
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];

            }else if(arr[i]>max2){
                max3=max2;
                max2 = arr[i];

            }else if(arr[i]>max3){
                max3 = arr[i];
            }
        }
        System.out.println(max3);
    }
}
/*
Output :
5
*/
