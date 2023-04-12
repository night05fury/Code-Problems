package LeetCode_Problems;

class BinaryNumber{
    public int search(int[] nums, int target) {

        // Approach 1
        
        /*for(int i=0;i< nums.length;i++)
        {
         if(   nums[i]==target)
         {
             return i;
         }
        }
        return -1;
        */
        //Approach 2
        int left=0;
        int right=nums.length-1;

        while(left<=right)
        {
            int mid=left + (right-left)/2;  // to avoid the integer overflow in case of very big arrays 
            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid]<target) //shift position of left to Mid +1
            {
                left=mid+1;
            }else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}