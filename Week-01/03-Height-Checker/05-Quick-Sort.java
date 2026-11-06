class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            expected[i]=heights[i];
        }
        
        int low=0;
        int high=expected.length-1;
        quicksort(expected, low, high);

        int count=0;
        for(int i=0;i<heights.length;i++) {
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
    
    public int partition(int expected[], int low, int high) {
        
        int pivot=expected[high];
        int i=low-1;
        for(int j=low;j<high;j++) {
            if(expected[j]<pivot) {
                i++;
                int temp=expected[i];
                expected[i]=expected[j];
                expected[j]=temp;
            }
        }
        int temp=expected[i+1];
        expected[i+1]=expected[high];
        expected[high]=temp;

        return i+1;
    }

    public void quicksort(int expected[], int low, int high) {

        if(low<high) {
        int p=partition(expected, low, high);
        quicksort(expected, low, p-1);
        quicksort(expected, p+1, high);
        }
    }
}
