import java.util.Arrays;
import java.util.Scanner;

public class Permutation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // int N = input.nextInt();
    System.out.print("Size:");
    int size = input.nextInt();
    int nums[] = new int[size];
    System.out.println("Values should be < " + (nums.length) + " :");
    for (int i = 0; i < nums.length; i++) {
      System.out.print("element " + (i + 1) + " :");
      nums[i] = input.nextInt();
    }

    // System.out.println(nums.length);

    System.out.println(Arrays.toString(buildArray(nums)));
  }

  static int[] buildArray(int[] nums) {
    int ans[] = new int[nums.length];
    for (int i = 0; i <= ans.length - 1; i++) {
      ans[i] = nums[nums[i]];
    }

    return ans;
  }
}
