package LeetCode_Problems;

import java.util.Arrays;

//https://leetcode.com/problems/next-greater-element-iii/
public class ElementGrater3 {
    public int nextGreaterElement(int n)
    {
        char [] num=(n+"").toCharArray();
        int i,j;
// finding the first smallest number while traversing from the reverse
        for(i=num.length-1;i>0;i--)
        {
            if(num[i-1]<num[i])
                break;
        }
        //edge case scenario
        if(i==0)
            return -1;

        int q=num[i-1], smallest=i;
        for(j=i;j<num.length;j++)
        {
            if(num[j]>q && num[j]<=num[smallest])
                smallest=j;
        }
        //swapping the two smallest numbers that we found above
        char temp=num[i-1];
        num[i-1]=num[smallest];
        num[smallest]=temp;
        //now sorting the numbers after (i-1) in ascending order
        Arrays.sort(num,i,num.length);
        //parsing the array back to Integer data type
        long result=Long.parseLong(new String(num));
        return (int)result;
        //return (result <=Integer.MAX_VALUE)?(int) result:-1;
    }

    public static void main(String[] args) {
        int l=73651;
        ElementGrater3 obj=new ElementGrater3();

        obj.nextGreaterElement(l);    }
}
