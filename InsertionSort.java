import java.util.Scanner;
public class InsertionSort{
    public static void insertionSort(int arr[]){
        int n=arr.length;
        int i,j,current;
        for (i=1; i<n; i++){
            j=i-1;
            current=arr[i];
            while (j>=0 && current<arr[j]){
                    arr[j+1]=arr[j];
                    j=j-1;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        insertionSort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}