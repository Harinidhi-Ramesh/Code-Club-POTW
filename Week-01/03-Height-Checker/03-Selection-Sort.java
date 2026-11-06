class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            expected[i]=heights[i];
        }
        for(int i=0;i<heights.length-1;i++) {
            int min=i;
            for(int j=i+1;j<heights.length;j++) {;
                if(expected[min]>expected[j]) {
                    min=j;
                }
            }
            int temp=expected[min];
            expected[min]=expected[i];
            expected[i]=temp;
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
