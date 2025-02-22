// Description

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.



class SqrtRoot {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        long left = 1;
        long right = x;
        long result = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        
        return (int) result;
    }
    public static void main(String args[]){
        SqrtRoot sqrtRoot = new SqrtRoot();
        System.out.println(sqrtRoot.mySqrt(16)); // Expected output: 4
        System.out.println(sqrtRoot.mySqrt(8)); // Expected output: 2
    }

}