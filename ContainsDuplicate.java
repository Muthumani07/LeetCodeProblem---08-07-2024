// Description;
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true






class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        for(int i =0;i<nums.length;i++){
            for(int j = nums.length-1;j>=0;j--){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int num[] = {1,1,2,3,2,3,2,7,4,4};
        System.out.println(containsDuplicate(num)); // Expect - true;
    }
}