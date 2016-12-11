package twosum;

import java.util.HashMap;
import java.util.Map;

public class BetterSolution {
  public static void main(String[] args) {
    System.out.println(new BetterSolution().twoSum(new int[] {2, 3, 6, 7}, 9));
  }

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        result[1] = i;
        result[0] = map.get(target - nums[i]);
        return result;
      }
      map.put(nums[i], i);
    }
    return result;
  }
}
