package LeetCode_Problems;

import java.util.Stack;

public class Simplify_Path {
    public String simplifyPath(String path) {
        String[] arr=path.split("/");
        Stack<String> sr=new Stack<String>();
        if(arr.length==0)
        {
            return "/";
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==""|| arr[i].equals(".")){
                continue;
            }
            if(arr[i].equals(".."))
            {
                if(!sr.empty())
                {
                    sr.pop();
                }
            }else
            {
                sr.push(arr[i]);
            }
        }
        if(sr.empty()){
            return "/";
        }


        // String stStr = sr.stream().map(s -> s.toString()).collect(Collectors.joining("/"));


        return "/"+ String.join("/", sr);

    }
}
