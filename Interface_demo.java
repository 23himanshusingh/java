// Create an Interface named Shape with common properties like

// color -String, border-int, void fillColor() , void drawBorder(), void calcArea()

// The colour of all shapes is Black and Border thickness of all shapes is 2.

// Create the following classes which implements the Shape Interface. Include additional methods /constructors in the class to read the required parameters.

// Circle - data member: radius

// Square - data member: side

// Cylinder - data member: radius, height . Additionally calculate Volume also.

import java.util.*;
import java.lang.*;
interface Shape{
    String color="Black";
    int border=2;
    void fillColor();
    void drawBorder();
    void calcArea();
}
class Circle implements Shape{
    int r;
    public Circle(Scanner sc){
        r=sc.nextInt();
    }
    public void fillColor(){
        System.out.println("Colour of Circle is "+color);
    }
    public void drawBorder(){
        System.out.println("Border of Circle is "+border);
    }
    public void calcArea(){
        System.out.println("radius = "+r);
        System.out.printf("Area = %.1f\n",3.14*r*r);
    }
}
class Square implements Shape{
    int s;
    public Square(Scanner sc){
        s=sc.nextInt();
    }
    public void fillColor(){
        System.out.println("Colour of Square is "+color);
    }
    public void drawBorder(){
        System.out.println("Border of Square is "+border);
    }
    public void calcArea(){
        System.out.println("Side = "+s);
        System.out.println("Area = "+s*s);
    }
}
class Cylinder implements Shape{
    int ra,h;
    public Cylinder(Scanner sc){
        ra=sc.nextInt();
        h=sc.nextInt();
    }
    public void fillColor(){
        System.out.println("Colour of Cylinder is "+color);
    }
    public void drawBorder(){
        System.out.println("Border of Cylinder is "+border);
    }
    public void calcArea(){
        System.out.println("radius = "+ra);
        System.out.println("height = "+h);
        System.out.printf("Total Surface Area of Cylinder = %.1f\n",(2*3.14*ra*h)+(2*3.14*ra*ra));
        System.out.printf("Volume of Cylinder = %.1f\n",3.14*ra*ra*h);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Circle ci=new Circle(sc);
        ci.fillColor();
        ci.drawBorder();
        ci.calcArea();
        Square sq=new Square(sc);
        sq.fillColor();
        sq.drawBorder();
        sq.calcArea();
        Cylinder cy=new Cylinder(sc);
        cy.fillColor();
        cy.drawBorder();
        cy.calcArea();
    }
}