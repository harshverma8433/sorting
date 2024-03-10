import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int [] arr = {2,1,5,3,4};
        //  2 2 5 3 4
        for (int i = 1; i < arr.length; i++) {
            int k = arr[i]; 
            int j = i;   
            while(j > 0 && arr[j-1] > k){
                arr[j] = arr[j-1];
                j--;
            }  
            arr[j] = k;
            
        }

        System.out.println(Arrays.toString(arr));


    }

}
