import java.util.*;
import java.lang.*;
public class bill{
    public static double calculateBill(int units){
    if (units!=-1){
        if (units<=500){
            return (units*2)+5;
        }
        else if (units>500 && units<=1000){
            return (500*5)+((units-500)*7)+5;
        }
        else if (units>1000){
            return (1000*8)+((units-1000)*(5*0.18))+5;
        }
    }
    else{
        System.exit(0);
    }
    return 0;

    }

public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int units=s.nextInt();
    System.out.println(calculateBill(units));
}
}
