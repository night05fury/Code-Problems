package LeetCode_Problems.Patterns;
/*'
Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.
Help Geek to build a pattern.
Example 1:
Input: 5
Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Your Task:
You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.
Constraints:
    1<= N <= 20
 */
public class Pattern3
{
    void printTriangle(int n) {

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {

                System.out.print(j +" ");

            }

            System.out.println();
        }
    }
}
