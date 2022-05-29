import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] arr = {15, -11, 10, 2, 7, 0};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
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
