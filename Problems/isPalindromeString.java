package Problems;

public class isPalindromeString {

        public boolean isPalindrome(String s) {

            s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            String s2 = new StringBuilder(s).reverse().toString();
            return s2.equals(s);
            // int i = 0;
            // int j = s.length() - 1;/


            // while(i <= j) {
            //     if (s.charAt(i) != s.charAt(j)) {
            //         return false;
            //     }
            //     i++;
            //     j--;
            // }
            //return true;
        }
    }

