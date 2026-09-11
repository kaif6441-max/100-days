class Solution {
    static int dp[];
    public int minCost(int days[],int costs[],int i){
        if(i >= days.length) return 0;
        if(dp[i] !=-1) return dp[i];
        int curr = days[i];
        int id1 = days.length,id2 = days.length;
        int day1 = costs[0] + minCost(days,costs,i+1);
        int day7,day30;
        for(int j = i+1;j<days.length;j++){
            if(days[j] >= curr + 7){
                id1 = j;
                break;
            }
        }
            for(int j = i+1;j<days.length;j++){
            if(days[j] >= curr + 30){
                id2 = j;
                break;
            }
        }
        day7 = costs[1] + minCost(days,costs,id1);
        day30 = costs[2] + minCost(days,costs,id2);
        return dp[i] = Math.min(day1,Math.min(day7,day30));
         
    }
    public int mincostTickets(int[] days, int[] costs) {
        dp = new int[days.length];
        Arrays.fill(dp,-1);
        return minCost(days,costs,0);
    }
}