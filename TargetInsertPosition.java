//Description;

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.


// Input: nums = [1,3,5,6], target = 5
// Output: 2



class TargetInsertPosition {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
    
            return left;        
        }
    public static void main(String [] args){
        TargetInsertPosition obj = new TargetInsertPosition();
        int nums[] = {1,3,5,6};
        int target = 5;
        System.out.println(obj.searchInsert(nums, target)); // Expect Output - 2;

    }
}