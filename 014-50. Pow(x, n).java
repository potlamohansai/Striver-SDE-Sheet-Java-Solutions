class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        long nn = n;
        if(nn <0) nn = -1*nn;

        while(nn>0){
            if(nn%2 ==1){
                ans = ans*x;
                nn = nn-1;
            }else{
                x = x*x;
                nn = nn/2;
            }
        }

        if(n<0) ans = (double) 1.0/ans;
        return ans;

    }
}


/*
Time Complexity:
The time complexity of this code is O(log n), where n is the exponent n.

The code iterates through the loop until nn becomes zero, which takes logarithmic time with respect to n.
In each iteration, nn is halved or decremented by one, which contributes to the logarithmic time complexity.
  
Space Complexity:
The space complexity of this code is O(1), i.e., constant space.

The space used by the additional variables (ans, nn) does not depend on the size of the input.
Hence, the space complexity remains constant, irrespective of the input size.
In summary:

Time Complexity: O(log n)
Space Complexity: O(1)
*/
