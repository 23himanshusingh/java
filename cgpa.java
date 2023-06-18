import java.util.*;
class student{
    int reg;
    String name;
    double cgp;
    int a;
    String b;
    int c;
    String d;
    int e;
    public student(Scanner sc){
        reg=sc.nextInt();
        name=sc.next();
        cgp=sc.nextDouble();
        a=sc.nextInt();
        b=sc.next();
        c=sc.nextInt();
        d=sc.next();
        e=sc.nextInt();
    }

}
class cgpa{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;int total=0;int m=-1;int ma=-1;
        n=sc.nextInt();
        student []ob=new student[n];
        for (int i=0;i<n;i++){
            ob[i]=new student(sc);
            total+=(ob[i].a*5);
            total+=(10*ob[i].c);
            if (ob[i].cgp>9){
                total+=10;
            }
            else if (ob[i].cgp>=8 && ob[i].cgp<=9){
                total+=6;
            }
            total+=(ob[i].e*2);
            if (total>ma){
                ma=total;
                m=i;
            }
        }
        System.out.println(ob[m].reg+"\n"+ob[m].name);
    }
}
