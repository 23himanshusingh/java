import java.util.*;
class Person{
    String name;
    int age;
    void getData(Scanner sc){

    }
    void putData(){

    }

}
class Professor extends Person{
    int pub;
    static int empid=0;
    void getData(Scanner sc){
        name = sc.next();
        age = sc.nextInt(); pub=sc.nextInt();
    }
    void putData(){
        empid++;
        System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Publications:"+pub+"\n"+"Professor ID:"+empid);
    }
}
class Student extends Person{
    int marks[]=new int[3];
    static int studid=0;
    void getData(Scanner sc){
        name = sc.next();
        age = sc.nextInt();
        for (int i=0;i<3;i++){
            marks[i]=sc.nextInt();
        }
    }
    void putData(){
        studid++;
        System.out.println("Name:"+name+"\n"+"Age:"+age);
        for (int i=0;i<3;i++){
            System.out.println("Mark"+(i+1)+":"+marks[i]);
        }
        System.out.println("Student ID:"+studid);
    }

}
class dynamicPoly{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Person obj1=new Professor();
        obj1.getData(sc);
        obj1.putData();
        Person obj2=new Professor();
        obj2.getData(sc);
        obj2.putData();
        Person obj3=new Student();
        obj3.getData(sc);
        obj3.putData();       
        Person obj4=new Student();
        obj3.getData(sc);
        obj3.putData();


    }
}