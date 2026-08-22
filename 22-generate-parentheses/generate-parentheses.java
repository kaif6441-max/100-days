class Solution {
    public  void parenth(String s,int n,int o,int c,List<String> ans){
           if(c > o) return;
           if(o > (n/2) || c > (n/2)) return;
           if(s.length() == n){
               ans.add(s);
               return;
           } 
           parenth(s + '(', n, o+1, c,ans);
           parenth(s +")",n,o, c+1,ans);


        }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        parenth("",2 * n,0,0,ans);
        return ans;
    }
}