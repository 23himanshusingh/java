import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr[]=sc.nextLine().split(" ");
        char ch[]; String s;
        for (int i=0;i<arr.length;i++){
            s=arr[i];
            ch=s.toCharArray();
            Arrays.sort(ch);
            arr[i]=String.valueOf(ch);
        }
        for (String x:arr){
            System.out.print(x+" ");
        }
    }
}