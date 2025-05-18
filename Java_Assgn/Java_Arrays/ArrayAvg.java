package Java_Assgn.Java_Arrays;

public class ArrayAvg {
    public static double average(int[] array) {
        int sum = 0;
        for (int num : array)
            sum += num;
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        System.out.println("Average: " + average(nums));
    }
}
