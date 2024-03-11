import java.util.Arrays;

public class radix_sort {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 87, 456, 7 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 1; i < max; i *= 10) { // 1 10 100 (1000<456)
            count_sort(arr, i);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void count_sort(int[] arr, int v) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            // 4 2 7 6 7 (v=1)
            // 3 1 8 5 0(v=10)
            // 0 0 0 4 0(v=100)
            int lval = (arr[i] / v) % 10;
            count[lval]++;
        }

        // update count array
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        int l = arr.length - 1;
        // 34, 12, 87, 456, 7
        while (l >= 0) {
            int val = (arr[l] / v) % 10;
            count[val]--;
            result[count[val]] = arr[l];
            l--;
        }

        for (int i = 0; i < result.length; i++) {
            arr[i] = result[i];
        }

    }
}