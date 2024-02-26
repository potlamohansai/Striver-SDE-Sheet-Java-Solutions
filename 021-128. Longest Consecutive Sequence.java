class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n<=1) return n;
        int longest = 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }

        for(int x : nums){
            int cnt =0;
            if(!hs.contains(x-1)){
                while(hs.contains(x)){
                    cnt++;
                    x = x+1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}


/*
Time Complexity:

The first loop that populates the HashSet takes O(n) time, where n is the length of the input array nums.
The second loop iterates through the elements of nums, and for each element, it checks if the HashSet contains its predecessor. The HashSet lookup operation takes O(1) on average.
Inside the second loop, there's a while loop which iterates through consecutive elements in the worst case scenario. However, each number will be visited only once throughout the entire process, because once a sequence is encountered, the loop for that sequence won't run again. So, the overall time complexity for the second loop is also O(n).
Thus, the overall time complexity is O(n).

Space Complexity:

A HashSet is used to store the elements of the input array nums, which can have up to n elements. So, the space complexity due to the HashSet is O(n).
Other than that, there are a few integer variables used which would require constant space.
Therefore, the overall space complexity is O(n).

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/




