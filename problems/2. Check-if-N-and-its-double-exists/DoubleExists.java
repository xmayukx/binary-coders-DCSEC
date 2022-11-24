import java.util.Scanner;

public class DoubleExists {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      // int N = input.nextInt();
      System.out.print("Size: ");
      int size = input.nextInt();
      int nums[] = new int[size];
      // System.out.println("Values should be < " + (nums.length) + " :");
      for (int i = 0; i < nums.length; i++) {
        System.out.print("element " + (i + 1) + " :");
        nums[i] = input.nextInt();
      }

      System.out.println(checkIfExist(nums));
    }
  }

  static boolean checkIfExist(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = arr.length - 1; j >= 0; j--) {
        if (arr[i] == 2 * arr[j] && i != j) {
          count++;
        }
      }
    }

    if (count > 0) {
      return true;
    } else {
      return false;
    }
  }
}
