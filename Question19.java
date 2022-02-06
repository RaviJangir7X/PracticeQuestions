package practicequestion;

import java.util.Arrays;

/*
 Find First and Last Position of Element in Sorted Array

Example 1:
Input: array = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: array = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
public class Question19 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] array, int target) {
        int[] arr ={-1,-1};
        arr[0] = search(array,target,true);
        arr[1] = search(array,target,false);
        return arr;
    }
    public static int search(int[] nums, int target,boolean searchInLeft){
        int ans = -1;
        int start =0,end=nums.length-1;
        while(start<=end){
            int mid =start + (end-start )/2;
            if(nums[mid]<target){
                start =mid+1;
            }else if(nums[mid]>target){
                end =mid-1;
            }else{
                ans = mid;
                if(searchInLeft){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
