class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            Arrays.sort(nums);
            return;
        }

        for(int i=n-1 ; i>index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        int start = index+1;
        int end = n-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
}


/*
Time Complexity:
Let's analyze the time complexity of the nextPermutation method:

Finding the index to swap:

In the first loop, we iterate over the array from the second last element to the first element.
This takes O(n) time, where n is the length of the input array nums.
Finding the next permutation:

After finding the index index, we again iterate over the array from the last element to index to find the next element greater than nums[index].
This operation takes O(n) time in the worst case.
Reversing the remaining elements:

Reversing the elements from index + 1 to the end of the array takes O(n/2) = O(n) time.
Overall, the time complexity is dominated by the sorting operation, which is O(n).

Space Complexity:
The space complexity of this algorithm is O(1) because it uses only a constant amount of extra space, regardless of the input size. The algorithm performs all operations in-place without using any additional data structures that grow with the input size.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
