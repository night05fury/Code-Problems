package LeetCode_Problems;


import java.util.Arrays;

public class Rotate_array {
    static void  rotate_arr(int [] nums,int k)
    {

        // approach with N^2

       /*
        while(k>0)
        {
            temp=nums[nums.length-1];
            for(int i= nums.length-1;i>0;i--)
            {

                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            k--;
        }
        */
        System.out.println(Arrays.toString(nums));
        //return nums;

        //approach 2 with O(N) time complexity

        int n = nums.length;
        if(k >= n) k = k % n;
        int [] ans = new int[n];
        if (k >= 0) System.arraycopy(nums, n - k, ans, 0, k);
//        for(int i = 0;  i < k;i++){
//            ans[i] = nums[n-k+i];
//        }
        if (n - k >= 0) System.arraycopy(nums, 0, ans, 0 + k, n - k);
//        for (int j = 0 ; j < n-k;j ++){
//            ans[j+k] = nums[j];
//        }
        System.arraycopy(ans, 0, nums, 0, n);
//        for(int i = 0; i < n ; i++){
//            nums[i] = ans[i];
//        }

    }

    public static void main(String[] args) {
        int xyz[]={1,2,3,4,5,6,7};
        int k=3;
        rotate_arr(xyz,k);
    }
}
