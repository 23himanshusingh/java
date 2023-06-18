import java.util.*;
public class ArrayEquilibriumIndex{
    public static int arrayEquilibriumIndex(int arr[]){
        int n=arr.length;
        int rsum=0,lsum=0;
        for (int i=0;i<n;i++){
            rsum+=arr[i];
        }
        for (int i=0;i<n;i++){
            rsum-=arr[i];
            if (rsum==lsum){
                return i;
            }
            lsum+=arr[i];
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt(); int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arrayEquilibriumIndex(arr));
    }
}