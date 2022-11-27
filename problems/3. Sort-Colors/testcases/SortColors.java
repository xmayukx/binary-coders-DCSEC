import java.util.Arrays;

public class SortColors {

  public static void main(String[] args) {

    int[] arr={2,0,2};
    System.out.println(Arrays.toString(sortColors(arr)));
  }

  static int[] sortColors(int[] nums) {
    int zero = 0, one = 0, two = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        zero++;
      } else if (nums[i] == 1) {
        one++;
      } else if (nums[i] == 2) {
        two++;
      }
    }
    for (int i = 0; i < nums.length;) {
      while (zero > 0) {
        nums[i] = 0;
        zero--;
        i++;
      }
      while (one > 0) {
        nums[i] = 1;
        one--;
        i++;
      }
      while (two > 0) {
        nums[i] = 2;
        two--;
        i++;
      }
    }

    // for (int i = 0; i <nums.length; i++) {
    //     System.out.print(nums[i]);
    // }
    return nums;
  }
}
