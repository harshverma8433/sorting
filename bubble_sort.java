import java.util.Arrays;

public class bubble_sort{
    public static void main(String[] args) {
        int[] arr = {6,9,7,2,0,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
                
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}