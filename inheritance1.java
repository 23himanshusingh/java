import java.lang.*;
import java.util.*;
class GeometricObject{
    private String color;
    private boolean filled;
    GeometricObject(){}
    GeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color=color;
    }
    boolean isFilled(){
        return this.filled;
    }
    void setFilled(boolean filled){
        this.filled=filled;
    }
}
class Circle extends GeometricObject{
    private double radius;
    Circle(){}
    Circle(double radius){
        this.radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    double getArea(){
        return Math.pi*radius*radius;
    }
    double getPerimeter(){
        return 2*Math.pi*radius;
    }
    void printCircle(){

    }
}
class Rectangle extends GeometricObject{
    private double width;
    private double height;
    Rectangle(){}
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    void setData(double width,double height){
        this.width=width;
        this.height=height;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }
    void printRectangle(){

    }
}
class Main{
    public static void main(String[]args){
        Circle c1(),c2(2.0),c3(3.0,"Black",true);
        Rectangle r1(),r2(5,10),r3(10,15,"Red",true);
    } 
}