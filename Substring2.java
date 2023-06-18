import java.util.*;
public class Substring2{
    public static void printSubstring(String str){
        int n=str.length();
        for (int len=1;len<=n;len++){
            for (int start =0 ;start<=n-len;start++){
                int end=start+len-1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printSubstring(str);
    }
}