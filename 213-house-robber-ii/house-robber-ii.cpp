class Solution {
public:
    int Loot(vector<int>& nums){
        int prev2  = 0;
        int prev = nums[0];
        for(int i=1;i<nums.size();i++){
            int pick = nums[i];
            if(i>1){
                pick+= prev2;
            }
            int notpick = prev;

            int cur = max(pick,notpick);
             
            prev2 = prev ;
            prev = cur;
        }

        cout<<prev<<endl;
        return prev;
    }
    int rob(vector<int>& nums) {
        int n = nums.size();
        if(n==1){
            return nums[0];
        }
        vector<int> first;
        vector<int> second;

        for(int i=0;i<n;i++){
            if(i!=0){ second.push_back(nums[i]);}
            if(i!=n-1){first.push_back(nums[i]);}
        }
        int ans1 = Loot(first);
        int ans2 = Loot(second);

        return max(ans1, ans2);
    }
};