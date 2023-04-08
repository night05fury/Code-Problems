package Problems;

import java.util.Scanner;

public class isPalindrome {
    public String is_palindrome(int n)
    {
        int rev=n;
        int temp=1,r=0;
        while(n>0){
            temp=n%10;
            r=r*10+temp;
            n=n/10;
        }
        if(rev==r)
        { System.out.println("Yes");
           return "Yes";
            //
        }
        else
        {
            System.out.println("No");
            return "No";
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPalindrome obj = new isPalindrome();
        obj.is_palindrome(n);
    }
}
