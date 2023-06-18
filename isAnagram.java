import java.util.Scanner;

public class isAnagram {

    static boolean isAnagramfunc(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();
        int char1[]=new int[256];
        int char2[]=new int[256];
        for (int i=0;i<a.length() && i<b.length();i++){
            char1[a.charAt(i)]++;
            char2[b.charAt(i)]++;
        }
        if (a.length()!=b.length()){
            return false;
        }
        for (int i=0;i<256;i++){
            if (char1[i]!=char2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagramfunc(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}