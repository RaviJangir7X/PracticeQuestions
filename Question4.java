package practicequestion;

import java.util.HashMap;
import java.util.Map;

/*
* Question 4 : Program to find the frequency of each element in the array
* Link : https://www.javatpoint.com/java-program-to-find-the-frequency-of-each-element-in-the-array
* */
public class Question4 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,1,1,8,6,4,7,0};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }

        }
        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "-->" + e.getValue());
            
        }
    }
}
/*
Output :
0-->1
1-->3
2-->2
4-->1
5-->1
6-->1
7-->1
8-->1
*/