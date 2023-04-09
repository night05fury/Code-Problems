package Problems;

import java.util.Arrays;

public class SqauresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int L = 0, R = nums.length-1;
        int arr[] = new int[nums.length];
        for(int i = nums.length-1; i>=0; i--){
            if(Math.abs(nums[L])>=Math.abs(nums[R])){
                arr[i]=nums[L]*nums[L];
                L++;
            }
            else{
                arr[i] =nums[R]*nums[R];
                R--;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static void main(String[] args) {
        int xyz[]={-5,-4,-0,3,10};
        SqauresOfSortedArray obj=new SqauresOfSortedArray();
        obj.sortedSquares(xyz);
    }
}
