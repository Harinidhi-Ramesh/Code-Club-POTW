class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            expected[i]=heights[i];
        }
        for(int i=0;i<heights.length;i++) {
            for(int j=0;j<heights.length-1;j++) {;
                if(expected[j]>expected[j+1]) {
                    int temp=expected[j];
                    expected[j]=expected[j+1];
                    expected[j+1]=temp;
                }
            }
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
