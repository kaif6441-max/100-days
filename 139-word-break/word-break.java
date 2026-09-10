class Solution {
    Map<String, Boolean> dp = new HashMap<>();
    public boolean word(int i, String s, Set<String> dict, String tmp) {
        if (i >= s.length()) {
            return tmp.length() == 0;
        }
        String key = i + "+" + tmp;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        tmp += s.charAt(i);
        boolean ans = false;
        if (dict.contains(tmp)) {
            ans = ans || word(i + 1, s, dict, "");
        }
        ans = ans || word(i + 1, s, dict, tmp);
        dp.put(key, ans);
        return ans;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        dp = new HashMap<>();
        return word(0, s, dict, "");
    }
}