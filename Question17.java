package practicequestion;

import java.util.Arrays;
/*
Selection Sort
*/
public class Question17 {
    public static void main(String[] args) {
        int[] arr ={1,7,3,0,5,1,9,5};
        for (int i = 0; i <arr.length ; i++) {
            int smallest=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[smallest]){
                    smallest=j; // we are only changing indexes // so there is no need for extra swaps
                }

            }
            int temp = arr[smallest];   //only one swap in one iteration there will be no unnecessary swaps
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
Output :
[0, 1, 1, 3, 5, 5, 7, 9]
* */