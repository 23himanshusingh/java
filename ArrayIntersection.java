import java.util.Arrays;
import java.util.*;
public class ArrayIntersection{
    public static void intersection(int a1[],int a2[]){
        Arrays.sort(a1) ; Arrays.sort(a2) ;
        int n=a1.length ; int m=a2.length;
        int i=0,j=0;
        while (i<n && j<m){
            if (a1[i]<a2[j]){
                i++;
            }
            else if (a1[i]>a2[j]){
                j++;
            }
            else{
                System.out.print(a1[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); int m=sc.nextInt();
        int arr1[]=new int[n]; int arr2[]=new int[m];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        intersection(arr1,arr2);
    }
}