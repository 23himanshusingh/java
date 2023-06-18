import java.io.*;
import java.util.*;
//user defined class for generic stack
class stack <T>{
    //empty array list
    ArrayList<T> A;
    int top=-1;
    int size;
    stack(int size){
        this.size=size;
        this.A=new ArrayList<T>(size);
    }
    void push(T x){
        if (top+1==size){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            //overwriting existing element
            if (A.size()>top)
                A.set(top,x);
            //creating new element
            A.add(x);
        }
    }
    T pop(){
        if (top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            top--;
            return A.get(top+1);
        }
        return null;
    }
    boolean empty(){ return top==-1;}
    public String toString()
    {
 
        String Ans = "";
 
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
 
        Ans += String.valueOf(A.get(top));
 
        return Ans;
    }

}
public class stackGenerics{
    stack <Integer> s1=new stack<>(3);
    s1.push(10);
    s1.push(20);
    s1.push(30);
    
}