import java.util.*;
class exception1 extends Exception{

}
class exception2 extends Exception{
    
}
class MainFat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            int a,c,s;
            a=sc.nextInt();
            c=sc.nextInt();
            s=sc.nextInt();
            if ((a+c+s)==0){
                throw new exception2();
            }
            else{
                double avg=(double)a/(a+c+s);
                if (avg>0.2){
                    throw new exception1();
                }
                else{
                    System.out.println("Composition is Ok");
                }
            }
            

        }
        catch(exception1 e1){
            System.out.println("Cancer causing chemicals Exception");
        }
        catch(exception2 e2){
            System.out.println("Arithmetic Exception");
        }
    }
}