import java.util.*;
public class ReverseEachWord{
    public static void reverseEachWord(String str){
        int n=str.length();
        str+=' ';
        String ans=""; int start=0;
        for (int i=0;i<n+1;i++){
            if (str.charAt(i)==' '){
                String reversedWord=""; int end=i-1;
                for (int j=start;j<=end;j++){
                    reversedWord = str.charAt(j)+reversedWord;
                }
                ans=ans+reversedWord+' ';
                start=i+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        reverseEachWord(str);
    }
}