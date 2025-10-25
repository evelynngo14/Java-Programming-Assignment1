package cis3270.assignment1.chapter7;
//Print distinct numbers
import java.util.Scanner;
import java.util.Arrays;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int count = 1;
        Arrays.sort(nums);


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                count++;
        }

        System.out.println("The number of distinct numbers are: " + count);


        int[] distinctNums = new int[count];
        count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                distinctNums[count] = nums[i-1];
                count++;
            }
            distinctNums[count] = nums[i];
        }
        System.out.println("The distinct numbers are ");
        for (int j = 0; j < distinctNums.length; j++) {
            System.out.print(distinctNums[j] + " ");
        }

        }
    }
