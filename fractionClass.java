import java.util.*;
import java.lang.*;
class fraction{
    private int numerator;
    private int denominator;
    public fraction(int numerator,int denominator){
        if (denominator==0){
            denominator=1;
        }
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator=numerator;
        simplify();
    }
    public void setDenominator(int denominator){
        if (denominator==0){
            //throw error
            return;
        }
        this.denominator=denominator;
        simplify();
    }
    private void simplify(){
        int gcd=1;
        for (int i=2;i<=Math.min(numerator,denominator);i++){
            if (numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    void increment(){
        numerator=numerator+denominator;
        simplify();
    }
    void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public void add(fraction f2){
        //first fraction is the fraction on which function is called 
        //and second fraction is passed as argument to the function
        this.numerator=this.numerator*f2.denominator + this.denominator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }
    public static fraction add(fraction f1, fraction f2){
        int newNum=f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDen=f1.denominator*f2.denominator;
        fraction f3=new fraction(newNum,newDen);
        return f3;
    }
}
class fractionClass{
    public static void main(String args[]){
        fraction f1=new fraction(4,6);
        // f1.print();
        // f1.increment();
        // f1.print();
        fraction f2=new fraction(4,8);
        //f1+f2
        // f1.add(f2);
        // f1.print();
        fraction f3=fraction.add(f1,f2);
        f3.print();
    }
}
