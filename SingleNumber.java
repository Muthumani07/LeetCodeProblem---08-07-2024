// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1




class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
    public static void main(String args[]){
        int arr[] = { 1,1,2,2,4,3,3};
        System.out.println("Single number is " + singleNumber(arr)); //Expect - 4;
    } 
}