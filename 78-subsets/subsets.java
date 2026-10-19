class Solution {
    public void sub(List<List<Integer>> ans, List<Integer> out, List<Integer> inp) {
        ans.add(new ArrayList<>(out));
        if (inp.size() == 0)
            return;
        for (int i = 0; i < inp.size(); i++) {
            List<Integer> newinp = new ArrayList<>(inp);
            List<Integer> newout = new ArrayList<>(out);
            newout.add(newinp.get(i));
            newinp.subList(0, i + 1).clear();
            sub(ans, newout, newinp);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> inp = new ArrayList<>();
        for (int ele : nums)
            inp.add(ele);
        sub(ans, new ArrayList<>(), inp);
        return ans;

    }
}