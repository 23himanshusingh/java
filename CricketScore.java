import java.util.*;
class player{
    String pid;
    int m1,m2,m3;
    int total;
    public player(String pid,int m1,int m2,int m3,int total){
        this.pid=pid;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.total=total;
    }
}
class Sortbytotal implements Comparator<player>{
    public int compare(player p1,player p2){
        return p2.total-p1.total;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String pid;
        int m1,m2,m3;
        int total
        player []obj=new player[n];
        for (int i=0;i<n;i++){
            pid=sc.next();
            m1=sc.nextInt();
            m2=sc.nextInt();
            m3=sc.nextInt();
            total=m1+m2+m3;
            obj[i]=new player(pid,m1,m2,m3,total);
            
        }
        Arrays.sort(obj,new Sortbytotal());
        String check=sc.next();
        for (int i=0;i<n;i++){
            if (obj[i].pid.equals(check)){
                System.out.println(obj[i].pid);
                System.out.println(obj[i].total);
                System.out.println(i+1);

            }
        }
    }
}