import java.util.Arrays;

public class Sorted_1 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 8, 0, 63};
        boolean isSorted = false;
        int tmp;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
