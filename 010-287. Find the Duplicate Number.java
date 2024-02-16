class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        for(int num : nums){
            int idx = Math.abs(num);
            if(nums[idx] < 0){
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return n;
    }
}


/*
Time Complexity:
The time complexity of this algorithm is O(n), where n is the length of the input array nums.

The algorithm iterates through each element of the array once.
For each element, it computes the absolute value and checks the corresponding element's sign.
The array is modified in-place, and each element is visited only once.
Therefore, the time complexity is linear with respect to the size of the input array.

Space Complexity:
The space complexity of this algorithm is O(1), constant space complexity.

The algorithm modifies the input array in-place without using any additional data structures.
It only uses a few integer variables (n, idx) to keep track of indices and values.
Regardless of the size of the input array, the space used by these variables remains constant.
Therefore, the space complexity is independent of the input size and can be considered constant.
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
