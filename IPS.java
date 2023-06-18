import java.util.*;
class invalidAge extends Exception{ }
class person{
    public String name;
    public String DOB;
    public String gen;
    public person(String n,String d,String g){
        name=n;
        DOB=d;
        gen=g;
    }
}
class IPS{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        person [] p=new person[n];
        for (int i=0;i<n;i++){
            try{
                String na=sc.next();
                String bi=sc.next();
                String ge=sc.next();
                p[i]=new person(na,bi,ge);
                int y=Integer.parseInt(p[i].DOB.substring(4));
                int age=2021-y;
                System.out.println(p[i].name);
                if (p[i].gen.equals("Male")){
                    if (age>=18 && age<=30){
                        System.out.println("Eligible\n1");
                    }
                    else if (age>=31 && age<=60){
                        System.out.println("Eligible\n2");
                    }
                    else if (age>61){
                        System.out.println("Eligible\n3");
                    }
                    else {
                        throw new invalidAge();
                    }
                
                }
                else if (p[i].gen.equals("Female")){
                    if (age>=18 && age<=45){
                        System.out.println("Eligible\n4");
                    }
                    else if (age>=46 && age<=60){
                        System.out.println("Eligible\n5");
                    }
                    else if (age>61){
                        System.out.println("Eligible\n3");
                    }
                    else {
                        throw new invalidAge();
                    }
                
                }
                else{
                    if (age>=18){
                        System.out.println("Eligible\n4");
                    }
                    else{
                        throw new invalidAge();
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("Not Eligible\nNIL");
            }
            catch (invalidAge e2){
                System.out.println("Not Eligible\nNIL");
            }

        }
    }
}