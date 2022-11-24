import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class format {

  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long T = Long.parseLong(br.readLine());
    while (T-- > 0) {
      String[] line = br.readLine().trim().split(" ");
      int[] nums = new int[line.length];
      for (int i = 0; i < line.length; i++) {
        nums[i] = Integer.parseInt(line[i]);
      }
      int[] original = nums.clone();
      Arrays.sort(nums);
      HashMap<Integer, Integer> sorted = new HashMap<Integer, Integer>(
        nums.length
      );
      int[] rank = new int[nums.length];
      for (int j = 0, i = nums.length - 1; i >= 0; i--, j++) {
        if (sorted.containsKey(nums[i])) {
          j--;
          continue;
        }
        sorted.put(nums[i], j);
      }

      for (int i = 0; i < original.length; i++) {
        rank[i] = sorted.get(original[i]);
      }
      for (int i = 0; i < rank.length; i++) {
        System.out.print(rank[i] + " ");
      }
      System.out.println();
    }
  }
}
