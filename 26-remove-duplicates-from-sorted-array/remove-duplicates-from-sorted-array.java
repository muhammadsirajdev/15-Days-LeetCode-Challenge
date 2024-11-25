class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 

        int a = 0; 
        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] != nums[a]) { 
                a++;
                nums[a] = nums[i];
            }
        }
        return a + 1; 
    }
}
