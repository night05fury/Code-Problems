package DSA;

public class Day2_Questions {
    public static void main(String[] args) {
        int m = 0;int x=2,l=1;
        double n=0;
        for (int i = 0; i <= 50; i++) {
            m = i * 2;
            n = n + 1 / Math.pow(x, i);
            // System.out.println(i + "*" + "2" + "=" + m);
            //System.out.println(n);

        }

        //for factorial
        int j=1;
        while (j <= 5)
        {
            l=l*j;
            //System.out.println(l);
            j++;
        }

        //even number using while loop
        int k=10;
        j=0;
        while(j <= k)
        {
            System.out.print(j +"\t");
            j = j + 2;
        }
    }
}
