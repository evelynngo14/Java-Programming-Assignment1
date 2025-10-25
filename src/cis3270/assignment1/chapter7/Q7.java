package cis3270.assignment1.chapter7;
// count single digits
public class Q7 {
    public static void main(String[] args) {
        int[] nums = createArray();
        int[] countNums = countNums(nums);
        displayCounts(countNums);
    }

    public static int[] createArray() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10);
        }
        return nums;
    }

    public static int[] countNums(int nums[]) {
        int[] counts = new int[10];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
