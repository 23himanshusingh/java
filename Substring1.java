import java.util.*;
public class Substring1{
    public static String[] printSubstring(String str){
        int n=str.length(); int x=-1;
        String s[]=new String[100];
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){ 
                String dup="";
                for (int k=i;k<=j;k++){
                    dup=dup+str.charAt(k);
                }
                x++;
                s[x]=dup;
            }
        }
        return s;
    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        // int k=sc.nextInt();
        int n=str.length();
        String st[]=new String[100];
        st=printSubstring(str);
        for (String i:st){
            System.out.println(i);
        }
    }
}