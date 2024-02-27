class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum ==0){
                maxi = i+1;
            }else{
                if(hm.get(sum) != null){
                    maxi = Math.max(maxi, i-hm.get(sum));
                }
                else{
                    hm.put(sum, i);
                }
            }
        }
        return maxi;
    }
}


/*
Time Complexity:

The code iterates through the input array once in a single for-loop, which takes O(n) time, where n is the size of the input array.
Inside the loop, there are operations like adding to a HashMap, getting values from the HashMap, and calculating the maximum value. HashMap operations like put() and get() generally take O(1) time complexity on average.
Therefore, the overall time complexity is O(n).
  
Space Complexity:

The space complexity is primarily due to the HashMap. In the worst-case scenario, all distinct subarrays sum to different values. So, the HashMap could contain up to n distinct sum-value pairs.
Therefore, the space complexity due to the HashMap is O(n).
Additionally, there are a few integer variables used which would require constant space.
Thus, the overall space complexity is O(n).
  
In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
