import java.util.*;
class wrongYearInput extends Exception{

}
class wrongMonthInput extends Exception{

}
class wrongDayInput extends Exception{

}
class exception{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        try{
            int d=Integer.parseInt(sc.next());
            int m=Integer.parseInt(sc.next());
            int y=Integer.parseInt(sc.next());
            if (y!=2018){
                throw new wrongYearInput();
            }
            else if (m<1 || m>7){
                throw new wrongMonthInput();
            }
            else if (m==1 || m==3 || m==5){
                if (d<1 || d>31){
                    throw new wrongDayInput();
                }
            }
            else if (m==4 || m==6){
                if (d<1 || d>30){
                    throw new wrongDayInput();
                }
            }
            else if (m==2){
                if (d<1 || d>28){
                    throw new wrongDayInput();
                }
            }
            else if (m==7){
                if (d!=1){
                    throw new wrongDayInput();
                }
            }
            System.out.println(name+"is eligible for addmission in class-1");
        }
        catch(wrongYearInput e1){
            System.out.println("Not Eligible because of wrong year input for eligibility criteria");
        }
        catch(wrongMonthInput e2){
            System.out.println("Not Eligible because of wrong  month input for eligibility criteria");
        }
        catch(wrongDayInput e3){
            System.out.println("Not Eligible because of wrong day input for eligibility criteria");
        }
        
    }
}