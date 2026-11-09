class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int count=0;
        int i=0;
        int j=0;
        while(i<n && j<n) {
            count+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(i<n && j>=0) {
            if(i!=j) count+=mat[i][j];
            i++;
            j--;
        }
        return count;
    }
}

/*
* Time Complexity : O(n)
* Space Complexity : O(1)
*/
