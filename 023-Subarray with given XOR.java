public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int count = 0;
        int xorr = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(xorr, 1);
        
        for(int i=0; i<n; i++){
            xorr = xorr^A.get(i);
            int x = xorr^B;
          
            if(hm.containsKey(x)){
                count += hm.get(x);
            }
          
            if(hm.containsKey(xorr)){
                hm.put(xorr, (int)hm.get(xorr)+1);
            }else{
                hm.put(xorr, 1);
            }
        }
        return count;
    }
}


/*
Time Complexity:

The code iterates through the ArrayList once in a single for-loop, which takes O(n) time, where n is the size of the input ArrayList.
Inside the loop, there are operations like XOR operations, HashMap lookups, and HashMap insertions. XOR operations and HashMap operations like put() and get() generally take O(1) time complexity on average.
Therefore, the overall time complexity is O(n).

Space Complexity:

The space complexity is primarily due to the HashMap. In the worst-case scenario, all distinct XOR values could be stored in the HashMap.
The size of the HashMap can grow up to O(n) in the worst case, where n is the size of the input ArrayList.
Additionally, there are a few integer variables used which would require constant space.
Thus, the overall space complexity is O(n).

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
