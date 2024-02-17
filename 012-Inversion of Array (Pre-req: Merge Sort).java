import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }

    private static long mergeSort(long[] arr, int low, int high){
        long cnt =0;
        if(low >= high) return cnt;
        int mid = low+(high-low)/2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    private static long merge(long[] arr, int low, int mid, int high){
        ArrayList<Long> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        long cnt =0;

        while(left <=mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
        return cnt;
    }

}

/*
Time Complexity:
The time complexity of this code is O(n log n), where n is the number of elements in the input array.

The mergeSort function divides the array into halves recursively until it reaches single-element subarrays, which takes O(log n) time.
At each level of recursion, the merge function is called to merge two sorted subarrays, which takes O(n) time in the worst case.
Since the mergeSort function calls itself recursively O(log n) times and the merge function is called for each level of recursion, the overall time complexity is O(n log n).
Space Complexity:
The space complexity of this code is O(n), where n is the number of elements in the input array.

The merge function uses an auxiliary ArrayList temp to store the merged elements temporarily, which requires O(n) extra space.
Additionally, there is some space overhead for recursive function calls and local variables, but it remains O(n) considering the size of the input array.
Therefore, the space complexity is linear with respect to the input size.
In summary:

Time Complexity: O(n log n)
Space Complexity: O(n)
*/
