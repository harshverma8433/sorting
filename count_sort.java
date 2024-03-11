import java.util.Arrays;

public class count_sort {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 4, 5, 8, 7, 9, 6, 8, 1, 2 };

        int count[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // 0 1 2 3 4 5 6 7 8 9
        // 0 1 2 0 2 1 1 1 3 1

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        // 0 1 2 0 2 1 1 1 3  1
        // 0 1 3 3 5 6 7 8 11 12

        int[] result = new int[arr.length];
        int len = arr.length-1;
        while (len >= 0) {
            count[arr[len]]--;  
            result[count[arr[len]]] = arr[len];
            len--;

        }
        System.out.println(Arrays.toString(result));

    }
}