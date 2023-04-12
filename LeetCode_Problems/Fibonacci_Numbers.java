package LeetCode_Problems;

public class Fibonacci_Numbers {
    static int fibo(int n)
    {
        if(n==0)
            return 0;
        int a=1;
        int b=1;
        for(int i=1; i<n; i++){
            int temp=b;
            b=a+b;
            a=temp;
        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        int x=4;
        fibo(x);
    }
}
