package practicequestion;
/*
Insertion Sort
*/
public class Question16 {
    public static void main(String[] args) {
        int[] arr={2,7,1,9,0,2,6,8,3};
        for (int i = 0; i <arr.length; i++) {
            int current =arr[i];
            int j =i-1;
            //Shifting entire list to right to make space for current element at its actual place.
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placing current element.
            arr[j+1]=current;

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
/*
Output :
0 1 2 2 3 6 7 8 9
*/