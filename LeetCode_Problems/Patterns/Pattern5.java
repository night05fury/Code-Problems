package LeetCode_Problems.Patterns;
/*
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.
Help Geek build a star pattern.
Example 1:
Input: 5
Output:
* * * * *
* * * *
* * *
* *
*
Your Task:
You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.
Constraints:
    1<= N <= 20


 */
public class Pattern5 {
    void printTriangle(int n) {
        // code here

        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
