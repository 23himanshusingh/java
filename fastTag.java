import java.util.*;
class wrongVehType extends Exception{}
class wrongTripType extends Exception{}
class wrongSrcType extends Exception{}
class wrongDstType extends Exception{}
interface FastTag1{

}
class FastTag2 implements FastTag1{
    String vt,tt,src,dest;
    void input(String vt,String tt,String src,String dest){
        this.vt=vt;
        this.tt=tt;
        this.src=src;
        this.dest=dest;
    }
    void print(){
        if (vt.equals("T1")) System.out.println("Less Weight");
        else if (vt.equals("T2")) System.out.println("Heavy Weight");

        if (tt.equals("S")) System.out.println("Single");
        else if (tt.equals("R")) System.out.println("Return");
        else System.out.println("Monthly");

        if (src.equals("R1") && dest.equals("R2")){
            System.out.println(3);
            if (vt.equals("T1") && tt.equals("S")){
                System.out.println(3*45);
            }
            else if (vt.equals("T1") && tt.equals("R")){
                System.out.println(3*70);
            }
            else if (vt.equals("T1") && tt.equals("M")){
                System.out.println(3*1500);
            }

            if (vt.equals("T2") && tt.equals("S")){
                System.out.println(3*70);
            }
            else if (vt.equals("T2") && tt.equals("R")){
                System.out.println(3*120);
            }
            else if (vt.equals("T2") && tt.equals("M")){
                System.out.println(3*2700);
            }
        }
        else if (src.equals("R1") && dest.equals("R3")){
            System.out.println(4);
            if (vt.equals("T1") && tt.equals("S")){
                System.out.println(4*45);
            }
            else if (vt.equals("T1") && tt.equals("R")){
                System.out.println(4*70);
            }
            else if (vt.equals("T1") && tt.equals("M")){
                System.out.println(4*1500);
            }

            if (vt.equals("T2") && tt.equals("S")){
                System.out.println(4*70);
            }
            else if (vt.equals("T2") && tt.equals("R")){
                System.out.println(4*120);
            }
            else if (vt.equals("T2") && tt.equals("M")){
                System.out.println(3*2700);
            }
        }
        else if(src.equals("R2") && dest.equals("R3")){
            System.out.println(1);
            if (vt.equals("T1") && tt.equals("S")){
                System.out.println(45);
            }
            else if (vt.equals("T1") && tt.equals("R")){
                System.out.println(70);
            }
            else if (vt.equals("T1") && tt.equals("M")){
                System.out.println(1500);
            }

            if (vt.equals("T2") && tt.equals("S")){
                System.out.println(70);
            }
            else if (vt.equals("T2") && tt.equals("R")){
                System.out.println(120);
            }
            else if (vt.equals("T2") && tt.equals("M")){
                System.out.println(2700);
            }
        }
    }
}
class fastTag{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        FastTag2 ob = new FastTag2();
        try{
        String vt,tt,src,dest;
        vt=sc.next();
        if (!vt.equals("T1") && !vt.equals("T2")){
            throw new wrongVehType();
        }
        tt=sc.next();
        if (!tt.equals("S") && !tt .equals("R") && !tt.equals("M")){
            throw new wrongTripType();
        }
        src=sc.next();
        if (!src.equals("R1") && !src.equals("R2")){
            throw new wrongSrcType();
        }
        dest=sc.next();
        if (!dest.equals("R2") && !dest.equals("R3")){
            throw new wrongDstType();
        }
        ob.input(vt,tt,src,dest);
        ob.print();
        }
        catch (wrongVehType e1){
            System.out.println("wrong vehicle type");
        }
        catch(wrongTripType e2){
            System.out.println("wrong trip type");
        }
        catch(wrongSrcType e3){
            System.out.println("wrong source type");
        }
        catch(wrongDstType e4){
            System.out.println("wrong destination type");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

