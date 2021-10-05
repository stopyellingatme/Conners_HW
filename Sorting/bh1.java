import java.util.Arrays;
public class bh1 {
    public static void main (String[] args) {
        int [] arr = {35, 200, 11, 4, 7, 88, 20, 10, 9, 6};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j > - 1 && Sort.less(j, j + 1, arr);j--) {
                Sort.exch(j, j + 1, arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}