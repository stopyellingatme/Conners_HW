import java.util.Arrays;

// Useful Video for understanding each sorting algo
// https://www.youtube.com/watch?v=kPRA0W1kECg

public class Sort {

    public static void bg() {
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

    public static void bh() {
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

    public static void bf() {
        int [] arr = {35, 200, 11, 4, 7, 88, 20, 10, 9, 6};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j > - 1 && Sort.less(j, j + 1, arr);j--) {
                Sort.exch(j, j + 1, arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean less(int i, int j, int[] arr) {
        if (arr[j] < arr[i]) {
            return true;
        }
    else
        return false;
    }

    public static int[] exch(int i, int j, int[] arr) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        return arr;
    }

    public static boolean isSorted (int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        bg();
        bh();
        bf();
    }
}