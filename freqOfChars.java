import java.util.*;
class Main{
    public static String removeDuplicates(String s){
        String unique="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (unique.indexOf(c)<0){
                unique+=c;
            }
        }
        return unique;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String unique=removeDuplicates(s);
        int chars[]=new int[256];
        for (int i=0;i<s.length();i++){
            chars[s.charAt(i)]++;
        }
        for (int i=0;i<unique.length();i++){
            if (unique.charAt(i)!=' '){
                System.out.println(unique.charAt(i)+": "+chars[unique.charAt(i)]);
            }
        }
    }
}