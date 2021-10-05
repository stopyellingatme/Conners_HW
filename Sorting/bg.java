import java.util.Arrays;
public class bg {
    public static void main (String[] args) {
        int [] arr = {35, 200, 11, 4, 7, 88, 20, 10, 9, 6};
        System.out.println(Sort.isSorted(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Sort.less(i, j, arr)) {
                    Sort.exch(i, j, arr);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Sort.isSorted(arr));
    }
}