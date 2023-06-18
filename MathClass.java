public class MathClass {
    public static void main(String[] args) {
      int i = 7;
      int j = -9;
      double x = 72.3;
      double y = 0.34;
      System.out.println(x + " is approximately " + Math.round(x));    
      System.out.println(y + " is approximately " + Math.round(y));    
  
     // The "ceiling" of a number is the smallest integer greater than or equal to the number. Every integer is its own //ceiling.
      System.out.println("The ceiling of " + i + " is " + Math.ceil(i));    
      System.out.println("The ceiling of " + j + " is " + Math.ceil(j));
      System.out.println("The ceiling of " + x + " is " + Math.ceil(x));    
      System.out.println("The ceiling of " + y + " is " + Math.ceil(y));
  
      // The "floor" of a number is the largest integer less than or equal to the number.
      // Every integer is its own floor.
      System.out.println("The floor of " + i + " is " + Math.floor(i));    
      System.out.println("The floor of " + j + " is " + Math.floor(j));
      System.out.println("The floor of " + x + " is " + Math.floor(x));    
      System.out.println("The floor of " + y + " is " + Math.floor(y));

      System.out.println("pow(2.0, 2.0) is "  + Math.pow(2.0,2.0));
      System.out.println("pow(10.0, 3.5) is " + Math.pow(10.0,3.5));
      System.out.println("pow(8, -1) is "     + Math.pow(8,-1));
    }
}