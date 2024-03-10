public class count_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,3,1,2,0,5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max <  arr[i]){
                max = arr[i];
            }
        }

        int[] a = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]] = a[arr[i]]+1;
        }

        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            while(v > 0){
                System.out.print(i+" ");
                v--;
            }
        }



        // System.out.println(Arrays.toString(a));

    }
    
}
