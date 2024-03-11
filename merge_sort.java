import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int arr[] = {6,8,4,5,9,3,6,4,5,7,2,1,6,8,5,9,0,5,3};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int[] arr , int s , int e){
        if(s<e){
            int m = (s+e)/2;
            divide(arr , s, m);
            divide(arr , m+1 , e);
            conquer(arr , s , m , e);
        }
    }


    public static void conquer(int[] arr  ,int s , int m , int e){
        int l1 = m-s+1;
        int l2 = e-m;
        
        int left[]  = new int[l1];
        int right[] = new int[l2];


        for (int i = 0; i < left.length; i++) {
            left[i] =  arr[s + i];            
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[m+i+1];
        }

        int i = 0;
        int j = 0;
        int k = s;

        while(i<l1 && j<l2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        
        }

        while(i<l1){
            arr[k++] = left[i++];
        }

        while (j<l2) {
            arr[k++] = right[j++];
        }

    }
}
