package _219containsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    int[] nums = new int[] {2, 3, 5, 6, 3};
    int k = 5;
    int m = 1;
    assert new Solution().containsNearbyDuplicate(nums, k);
    assert !new Solution().containsNearbyDuplicate(nums, m);
  }
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      // 需要遍历整个列表.
      if (map.containsKey(nums[i]) &&  i - map.get(nums[i]) <= k) {
        return true;
      }
      map.put(nums[i], i);
    }
    return false;
  }
}
