public class Solution2 {
    public int[] Solution2(int[] nums){
        int[] ans = new int[2*nums.length];

        for(int i = 0; i < nums.length; i++ ){
            ans[i] = nums[i];
            for(int j=0; j<nums.length; j++){
                ans[i+nums.length] = nums[i];
            }
        }
        return ans;
    }
}
