package HackerRankChallengeVITB;
import java.util.Scanner;
public class StockBuynSell {
    public static void main(String[] args) {
        int num, max=0;
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=num-1;i>=0;i--)
        {
            for(int j=0;j<i;j++){
                max= Math.max((array[i] - array[j]), max);
            }
        }
        System.out.print(max);
    }
    }

