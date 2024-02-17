public class Concatanate {
    public void ConcatanateString(int[]  nums){
        int[] ans = new int[2*nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            ans[i + nums.length] = nums[i];
        }

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }

    }
}
