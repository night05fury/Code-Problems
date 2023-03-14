package Problems;

import java.util.Scanner;

import static java.lang.Math.min;

public class LCMandHCF {
    static Long[] lcmAndGcd(Long A, Long B) {
        // code here
        int hcf = 1;
        long mini = min(A, B);
        for (int i = 1; i < mini; i++) {
            if (A % i == 0 && B % i == 0)
                hcf = i;
        }

        Long LCM = (A * B) / hcf;
        Long val[]={LCM, (long) hcf};
        return val;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LCMandHCF obj=new LCMandHCF();
        Long k= sc.nextLong();
        Long m=sc.nextLong();
        lcmAndGcd(k,m);
    }
}
