class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange) {
            int n=numBottles/numExchange;
            sum+=n;
            numBottles=numBottles%numExchange+n;
        }
        return sum;
    }
}

/*
* Time Complexity: O(log n)
* Space Complexity: O(1)
*/
