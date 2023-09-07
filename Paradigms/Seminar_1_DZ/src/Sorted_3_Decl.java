import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorted_3_Decl {
    public static void main(String[] args) {
        Integer[] arr = {12, 3, 56, 8, 0, 63};

        Arrays.sort(arr, Collections.reverseOrder());

        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
