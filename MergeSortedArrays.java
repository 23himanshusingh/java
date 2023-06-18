import java.util.*;
public class MergeSortedArrays{
    public static int[] merge(int arr1[],int arr2[]){
        int ans[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i+=1;
                k+=1;
            }
            else{
                ans[k]=arr2[j];
                k+=1;
                j+=1;
            }
        }
        while (i<arr1.length){
            ans[k]=arr1[i];
            k+=1;
            i+=1;
        }
        while (j<arr2.length){
            ans[k]=arr2[j];
            k+=1;
            j+=1;
        }

        return ans;

    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++){
            arr1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++){
            arr2[i] = s.nextInt();
        }
        int[] ans = merge(arr1,arr2);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}