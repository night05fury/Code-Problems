package Problems;
import java.util.Scanner;



    class Solution1 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n" ,s1,x);  /*printf is used for the format
                specifier used here in the form of %-15s%03d\n  */
            }
            System.out.println("================================");

        }
    }



