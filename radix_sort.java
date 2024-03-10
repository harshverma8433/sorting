public class radix_sort {
    public static void main(String[] args) {
        int[] arr = {43,321,5,76,82};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            
        }

        int len = 0;
        while(max > 0){
            len++;
            max = max/10;
        }
        
        len = len-1;
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}