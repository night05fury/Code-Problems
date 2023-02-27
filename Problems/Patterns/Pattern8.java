package Problems.Patterns;
/*
Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.
Example 1:
Input: 5
Output:
*********
 *******
  *****
   ***
    *

Your Task:
You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.

Constraints:

    1<= N <= 20
 */
public class Pattern8 {
    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
