//binary search
import java.util.Scanner;
public class BinarySearch{
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(key < arr[mid]){
                high = mid - 1;
            }else if(key > arr[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index: " + index);
        }
    }
}