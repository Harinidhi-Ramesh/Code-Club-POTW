class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int pairs[] = new int[n];
    
        for(int i=0; i<n; i++) {
            int low = 0;
            int high = m-1;
            int ans = m;

            while(low <= high) {
                int mid = (low+high)/2;
                long pdt = (long)spells[i]*potions[mid];

                if(pdt >= success) {
                    ans = mid;
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            pairs[i] = m-ans;
        }
        
        return pairs;
    }
}

/*
* Time Complexity: O(m log m + n log m)
* Space Complexity: O(n)
*/
