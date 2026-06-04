class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newarr = new int[nums.length*2];
        for (int i=0; i<nums.length; i+=1){
            System.out.println(nums[i]);
            newarr[i] = nums[i];
            newarr[i+nums.length] = nums[i];
        }
        return newarr;
    }
}