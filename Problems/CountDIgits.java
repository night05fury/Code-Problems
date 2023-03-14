package Problems;
import java.util.Scanner;
public class CountDIgits {
    void countDigit(int n)
    {
        int count = 0;
        int x=n;
        while(x!=0)
        {

            int temp=x%10;
            if (temp==0) {
                x=x/10;
                continue;
            }
            if((n % temp) == 0)
            {
                count++;
            }
            x=x/10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CountDIgits obj=new CountDIgits();
        int k= sc.nextInt();
        obj.countDigit(k);
    }
}
