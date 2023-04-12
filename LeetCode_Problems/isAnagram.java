package LeetCode_Problems;

import java.util.Arrays;

//https://leetcode.com/LeetCode_Problems/valid-anagram/
public class isAnagram {
    static void anagram(String s, String t)
    {
        /*
        Approach is , i changed String to CHar Array and then compared them by Sorting them first
         */
        s=s.toLowerCase();
        t=t.toLowerCase();
        if (s.length()!=t.length())
        {System.out.println(false);
            System.exit(1);} else if (s.length()==1) {
            System.out.println(s.charAt(0)==t.charAt(0));
        }
        char []temp1 =  s.toCharArray();
        char []temp2=t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);


        System.out.println(Arrays.equals(temp1, temp2));
    }

    public static void main(String[] args) {

        String x="Rfatcar";
        String y="carrat";
        anagram(x,y);
    }
}
