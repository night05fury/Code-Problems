package Problems;
import java.util.*;



class Solution {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();  // used this line for eliminating the nextDouble tokens
        String s=scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}