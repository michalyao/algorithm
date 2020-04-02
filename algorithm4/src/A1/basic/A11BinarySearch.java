package A1.basic;

import java.util.Arrays;

/**
 * Created by yaoyao on 2020/4/2
 * Description:
 */
public class A11BinarySearch {
    public static int binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                high = mid - 1;
            }
            if (key > array[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6, 7, 2, 4};
        Arrays.sort(array);
        System.out.println(binarySearch(4, array));
        System.out.println(binarySearch(8, array));
    }
}
