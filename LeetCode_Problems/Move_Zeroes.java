package LeetCode_Problems;

import java.util.Arrays;

public class Move_Zeroes {
    static void move(int []nums)
    {
        int zeroCount=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]==0)
            {
                zeroCount++;
            } else if (zeroCount>0) {
                int t=nums[i];
                nums[i]=0;
                nums[i-zeroCount]=t;
            }

        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[]xyz={0,1,0,3,12};
        move(xyz);
    }
}
