class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            expected[i]=heights[i];
        }
        
        for(int i=1; i<heights.length; i++) {
            int key=expected[i];
            int j=i-1;
            while(j>=0 && expected[j]>key) {
                expected[j+1]=expected[j];
                j--;
            }
            expected[j+1]=key;
        }

        int count=0;
        for(int i=0;i<heights.length;i++) {
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
}

/*
* Time Complexity: O(n^2)
* Space Complexity: O(n)
*/
