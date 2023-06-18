/*Assume that Metrocity-Promotors introducing the revised incentive scheme for their Customer Relationship Managers (CRM).
The Net-salary will be paid along with the incentives depending on their achievement in sales of plots for the particular month.
Develop the java application by using inheritance and abstract class to calculate the Net-salary with the following considerations.*/

/*The basic pay of the CRM is 1,00,000
If the CRM has sold out 100 plots in a month then the incentive is equal to the salary. He will get the double of basic pay as the Net- salary of that month.
If the CRM has sold out from 75 plots and less than 100 plots, then the half of the basic pay will be given as the incentive.
If the CRM has sold out less than 75 plots, then 10 percent of the basic pay will be provided as incentive.
If there are no plots sold out by the CRM then he will be getting basic pay as the Net-salary.*/
/*Input Format

Read 4 CRM’s achievements

First line of the input: CRM1 number of plots sold

Second line of the input: CRM2 number of plots sold

Third line of the input: CRM3 number of plots sold

Fourth line of the input: CRM4 number of plots sold

Output Format

Net-salary of CRM1

Net-salary of CRM2

Net-salary of CRM3

Net-salary of CRM4*/

/*Example Input

100

80

50

0

Example Output

200000.0

150000.0

110000.0

100000.0 */
import java.util.*;
abstract class salary1{
    abstract void print(int plots);
}
class salary2 extends salary1{
    int plots;
    public void print(int plots){
        if (plots==100){
            System.out.println(200000);
        }
        else if(plots>=75 && plots<100){
            System.out.println(150000);
        }
        else if(plots<75 && plots>0){
            System.out.println(110000);
        }
        else{
            System.out.println(100000);
        }
    }
}
class CRM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        salary2 obj=new salary2();
        for (int i=0;i<4;i++){
            a[i]=sc.nextInt();
            obj.print(a[i]);
        }
    }
}