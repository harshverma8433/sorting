import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 3, 6 };
        quicksort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int l, int h) {
        if (l < h) {
            int partition_idx = partition(arr, l, h); // 2
            quicksort(arr, l, partition_idx); //
            quicksort(arr, partition_idx + 1, h);

        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l]; // starting
        int start = l;   
        int end = h;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                swap(arr, start, end);
            }
        }

        // swap end pivot
        swap(arr, l, end);

        return end;
    }

    public static void swap(int[] arr, int l, int h) {
        int swap = arr[l];
        arr[l] = arr[h];
        arr[h] = swap;
    }
}