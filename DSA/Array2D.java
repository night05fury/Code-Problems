package DSA;
import java.util.*;
public class Array2D
{
    // while declaring it is mandatory to give column size of the 2D Array
    public static void main(String[] args)
    {
        int[][] a =new int [2][3];
        System.out.println("Enter the elements in the array");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        // for displAYING
        for (int k=0;k<2;k++)
        {
            for (int m=0;m<3;m++)
            {
                System.out.print(a[k][m] + " ");
            }
            System.out.println();
        }
    }
}
