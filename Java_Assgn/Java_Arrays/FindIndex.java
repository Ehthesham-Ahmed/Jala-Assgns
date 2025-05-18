package Java_Assgn.Java_Arrays;
import java.util.Arrays;
public class FindIndex {
    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 10, 15, 20 };
        int index = findIndex(nums, 15);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Index of 15: " + index);
    }
}