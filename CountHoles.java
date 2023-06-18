import java.util.*;
interface counter{
    void hole(int n);
    void w_hole(int n);
}
class Impl implements counter{
    public void hole(int n){
        int d,cnt=0;
        while(n>0){
            d=n%10;
            if (d==0 || d==6 || d==8 || d==9){
                cnt++;
            }
            n=n/10;
        }
        System.out.println(cnt);
    }
    public void w_hole(int n){
        int d,cnt=0;
        while(n>0){
            d=n%10;
            if (d==0 || d==6 || d==8 || d==9){
                continue;
            }
            else{
                cnt++;
            }
            n=n/10;
        }
        System.out.println(cnt);
    }
}
class Main {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Impl obj=new Impl();
        obj.hole(n);
        obj.w_hole(n);
    }
}