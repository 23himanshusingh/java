import java util.*;
class player{
    String pid;
    String n;
    int bat,ball,m;
    public player(String pid,String n,int bat,int ball,int m){
        this.pid=pid;
        this.n=n;
        this.bat=bat;
        this.ball=ball;
        this.m=m;
    }
}
class collections{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        player []obj=new player[n];
        ArrayList <String> id=new ArrayList<>();
        ArrayList <String> name=new ArrayList<>();
        ArrayList <Integer> batavg=new ArrayList<>();
        ArrayList <Integer> ballavg=new ArrayList<>();
        String pid;
        String n;
        int bat,ball,m; int baavg,boavg;
        for (int i=0;i<n;i++){
            pid=sc.next(); id.add(pid);
            n=sc.next(); name.add(n);
            bat=sc.nextInt(); 
            ball=sc.nextInt();
            m=sc.nextInt();
            obj[i]=new player(pid,n,bat,ball,m);
            baavg=bat/m; batavg.add(baavg);
            boavg=ball/m; ballavg.add(boavg);

        }
        for (int i=0;i<n;i++){
            if (batavg.get(i)<50 && ballavg.get(i)<2){
                id.remove(id.get(i));
                name.remove(name.get(i));
            }
        }
    }
}