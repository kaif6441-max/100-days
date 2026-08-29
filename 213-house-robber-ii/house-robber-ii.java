class Solution {
    static int dp[][];

    public int rob(int[] nums,int i,int flg) {
        if(i>=nums.length)return 0;
        if(i==nums.length-1){
            if(flg==0) return nums[i];
            else return 0;
        }
        if (dp[i][flg]!=-1) return dp[i][flg];
        int ans = 0;
        if (flg==0){
            int c1;
            if(i==0){
                c1 = nums[i]+rob(nums,i+2,1);
            }else{
                c1=nums[i]+rob(nums,i+2,flg);
            }
            int c2=rob(nums,i+1,flg);
            ans = Math.max(c1,ans);
            ans = Math.max(ans,c2);
            }
            if(flg==1){
                int c1;
                if(i==nums.length-1){
                    c1=nums[i]+rob(nums,i+2,1);
                }else{
                    c1=nums[i]+rob(nums,i+2,flg);
                }
                int c2 =rob(nums,i+1,flg);
                ans = Math.max(c1,ans);
                ans = Math.max(ans,c2);
            }
            return dp[i][flg] = ans;

        }
        public int rob(int[]nums){
            dp = new int[101][2];
            for(int d[]:dp){
                Arrays.fill(d,-1);
            }
            return rob(nums,0,0);

        }

        
    }
