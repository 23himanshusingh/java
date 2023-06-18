import java.io.*;
import java.util.*;

public class splitTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
    //    String[] arrs = s.trim().split("[ !,?._'@]+");
    String[] arrs = s.trim().split(" ");
       if(s.trim().isEmpty())
       {
         System.out.println("0");
       }
       else
       {
       System.out.println(arrs.length);
       for(String x : arrs)
       {
           System.out.println(x);
       }
    }
    }
}

