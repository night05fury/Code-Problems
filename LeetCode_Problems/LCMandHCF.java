package LeetCode_Problems;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.min;


public class LCMandHCF {
    static Long[] lcmAndGcd(Long A, Long B) {
        // code here
       Long gcd = null;
        int ans;

        if (B == 0) {
           gcd=A;
            System.out.println(gcd);
        }
        return lcmAndGcd(B, A % B);
        //System.out.println(A*B/gcd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        LCMandHCF obj=new LCMandHCF();
        Long k= sc.nextLong();
        Long m=sc.nextLong();
       // lcmAndGcd(k,m);
        System.out.println(Arrays.toString(lcmAndGcd(k, m)));
    }
}
