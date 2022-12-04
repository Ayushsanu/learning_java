class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=0;
        int j=1;
        for(int i=0;i<n-1;i++){
            if(nums[i] != nums[j]){
                count++;
                nums[count] = nums[j];
            }
            j++;
        }
        return count+1;
    } // Anmol Edited This File
}
