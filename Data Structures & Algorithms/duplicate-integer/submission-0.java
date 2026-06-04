class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();
        
        for(int i=0;i<nums.length;i+=1){
            if (seen.containsKey(nums[i])){return true;}
            else {seen.put(nums[i], 1);}
        }
        
        return false;
        
    }
}