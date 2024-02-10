class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int k = 0;

        while(k<=j){
            if(nums[k] == 0){
                swap(nums, i, k);
                i++; k++;
            }else if(nums[k] == 2){
                swap(nums, k, j);
                j--;
            }else{
                k++;
            }
        }
    }
    private void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

/*
Time Complexity:

The given code sorts the array in a single pass, so the time complexity is O(n), where n is the number of elements in the nums array.
Space Complexity:

The space complexity of the code is O(1) because it uses only a constant amount of extra space regardless of the size of the input array. The variables i, j, k, and temp are all individual integer variables, and their memory consumption is constant. Therefore, the space complexity is O(1).
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
