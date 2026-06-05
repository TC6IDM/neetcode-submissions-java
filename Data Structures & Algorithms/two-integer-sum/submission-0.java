class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length;i+=1){
            for (int j=i; j<nums.length;j+=1){
                if (i!=j){
                    if (nums[i]+nums[j] == target){
                        int[] ret = {i,j};
                        return ret;
                    }
                }
            }
        }
        return null;
    }
}
