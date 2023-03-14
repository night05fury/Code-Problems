package Problems;

public class ReverseA_Number {
    public static void main(String[] args) {
        int N = -201;
        int num = N;
        int reverse = 0;
        while(N!=0)
        {
            int digit = N%10;
            reverse = reverse*10+digit;
            N = N/10;
        }
        System.out.println(reverse);
    }
}
