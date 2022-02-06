package practicequestion;

import java.util.Arrays;
/*
Bubble Sort
*/
public class Question15 {
    public static void main(String[] args) {
        int[] arr ={5,4,3,28,5,71,5,4,3,2,6};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }

/*
Output : [2, 3, 3, 4, 4, 5, 5, 5, 6, 28, 71]
*/