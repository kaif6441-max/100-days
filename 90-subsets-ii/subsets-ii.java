import java.util.*;

class Solution {
    public void subsetWithDup(List<List<Integer>> ans,List<Integer> out,int[] nums,int index) {
        ans.add(new ArrayList<>(out));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            out.add(nums[i]);
            subsetWithDup(ans, out, nums, i + 1);
            out.remove(out.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subsetWithDup(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
}