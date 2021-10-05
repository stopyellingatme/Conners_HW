import java.util.Arrays;
public class bh {
    public static void main (String[] args) {
        int [] arr = {35, 200, 11, 4, 7, 88, 20, 10, 9, 6};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j > - 1 && arr[j + 1] < arr[j];j--) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}