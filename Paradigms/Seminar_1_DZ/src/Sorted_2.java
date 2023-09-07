import java.util.Arrays;

public class Sorted_2 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 8, 0, 63};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; i--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }  
        }
        System.out.println(Arrays.toString(arr));
    }
}
