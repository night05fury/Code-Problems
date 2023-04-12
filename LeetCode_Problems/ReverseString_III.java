package LeetCode_Problems;

public class ReverseString_III {
    static void revString (String s)
    {
        String[] str=s.split(" ");
        StringBuilder rev=new StringBuilder();
        for(String let:str)
        {
            rev.append(new StringBuilder(let).reverse().toString());
            rev.append(" ");
        }
        System.out.println(rev.toString().trim());
    }

    public static void main(String[] args) {
        String xyz="God String";
        revString(xyz);
    }
}
