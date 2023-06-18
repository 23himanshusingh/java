
// import java.io.*;
 
// class RemoveDuplicates {
//     public static void main(String[] args)
//     {
//         String s = "abcdabd";
//         String temp = s.charAt(0)+"";
 
//         for (int i = 1; i < s.length(); i++) {
//             if (!temp.contains(String.valueOf(s.charAt(i))))
//                 temp = temp + s.charAt(i);
//         }
//         System.out.println(temp);
//     }
// }
import java.util.*;
 
class IndexOf {
     
    // Function to make the string unique
    public static String unique(String s)
    {
        String str = "";//EMPTY STRING
        int len = s.length();
        //S=AABBCCDD
        // loop to traverse the string and
        // check for repeating chars using
        // IndexOf() method in Java
        for (int i = 0; i < len; i++)
        {
            // character at i'th index of s
            char c = s.charAt(i);
             
            // if c is present in str, it returns
            // the index of c, else it returns -1
            if (str.indexOf(c) < 0)
            {
                // adding c to str if -1 is returned
                str += c;//str="ABCD"
            }
        }
         
        return str;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        // Input string with repeating chars
        String s = "geeksforgeeks";
         
        System.out.println(unique(s));
    }
}