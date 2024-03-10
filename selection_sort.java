import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int swap = arr[min];
            arr[min] = arr[i];
            arr[i] = swap;
        }

        System.out.println(Arrays.toString(arr));
    }

}






