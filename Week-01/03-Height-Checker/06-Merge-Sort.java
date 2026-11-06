class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            expected[i]=heights[i];
        }

        mergeSort(expected, 0, expected.length - 1);

        int count=0;
        for(int i=0;i<heights.length;i++) {
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }

    public void mergeSort(int[] expected, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(expected, low, mid);
            mergeSort(expected, mid + 1, high);

            merge(expected, low, mid, high);
        }
    }

    public void merge(int[] expected, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = expected[low + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = expected[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                expected[k] = left[i];
                i++;
            } else {
                expected[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            expected[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            expected[k] = right[j];
            j++;
            k++;
        }
    }
}

/*
* Time Complexity: O(n log n)
* Space Complexity: O(n)
*/
