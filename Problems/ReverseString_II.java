package Problems;

public class ReverseString_II {
        public void reverseString(char[] s) {



            int l=0;
            int r=s.length-1;
            if(r>0)
            {
                while(l<r)
                {
                    char temp=s[r];
                    s[r--]=s[l];
                    s[l++]=temp;


                }
            }



    }
}
