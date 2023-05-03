package LeetCode_Problems;

import java.util.Stack;

public class isValid_Paranthesis {
    static boolean isValid(String s)
    {
        Stack<Character> ch=new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(ch.isEmpty())
            {
                ch.push(c);
            }else if(ch.peek()=='{' && ch.peek()=='}')
            {
                ch.pop();
            }
            else if(ch.peek()=='{' && ch.peek()==']')
            {
                ch.pop();
            }
            else if(ch.peek()=='(' && ch.peek()==')')
            {
                ch.pop();
            }
            else
                ch.push(c);


        }
        return ch.empty();
    }

    public static void main(String[] args) {
        String x= "][]{}{{}}[]";
        isValid(x);
    }
}
