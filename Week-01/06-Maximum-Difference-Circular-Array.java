class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int i=0;
        int adj=0;
        int max=0;
        while(n-->0) {
            int j = (i+1)%nums.length;
            adj=Math.abs(nums[i]-nums[j]);
            if(adj>max) max = adj;
            i++;
        }
        return max;
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
