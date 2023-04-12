package LeetCode_Problems;

import java.util.Arrays;

/*
Two Sum II - Input Array Is Sorted
 */
public class Two_SumII {
    static void twoSum(int[]numbers,int target)
    {
        // though this will give TLE on Leetcode
        int arr[] = new int[0];
        for(int i=0;i< numbers.length;i++) {
            for (int num = i+1; num <= numbers.length - 1; num++) {

                if (numbers[num] + numbers[i] == target) {
                    arr = new int[]{i+1, num+1 };
                }

            }
        }
        //return arr;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []xyz={2,7,11,15};
        int t=13;
        twoSum(xyz,t);
    }
}
