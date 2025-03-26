import java.util.Scanner;
import java.util.Arrays;

public class TwoSumDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Call the driver function for different approaches
        System.out.println("Using Brute Force:");
        runTwoSum(new BruteTwoSum(), nums, target);

        System.out.println("\nUsing Better Approach:");
        runTwoSum(new BetterTwoSum(), nums, target);

        System.out.println("\nUsing Optimal Approach (if sorted):");
        runTwoSum(new OptimalTwoSum(), nums, target);

        scanner.close();
    }

    public static void runTwoSum(Object solution, int[] nums, int target) {
        int[] result = new int[]{};

        if (solution instanceof BruteTwoSum) {
            result = ((BruteTwoSum) solution).twoSum(nums, target);
        } else if (solution instanceof BetterTwoSum) {
            result = ((BetterTwoSum) solution).twoSum(nums, target);
        } else if (solution instanceof OptimalTwoSum) {
            result = ((OptimalTwoSum) solution).twoSum(nums, target);
        }

        // Print result
        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }
}
