package Problems;

import java.util.Scanner;

public class sumOFdivisor {
    static long sumOfDivisors(int N){
        // code here
        int sum=0;
        for(int M=1;M<N;M++){
            for(int i = 1; i <= Math.sqrt(N); i++)
                if(M % i == 0){
                    sum=sum+i;
//                    if(i != M/i)
//                        sum=sum+(M/i);
                }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //sumOFdivisor obj=new sumOFdivisor();
        int n=sc.nextInt();
        //sumOfDivisors(n);
        System.out.println(sumOfDivisors(n));
    }
}
