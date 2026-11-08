class Solution {
    public void moveZeroes(int[] nums) {
        int grp=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                grp++;
            }
            else {
                int temp=nums[i];
                nums[i]=0;
                nums[i-grp]=temp;
            }
        }
    }
}

/*
* Time Complexity : O(n)
* Space Complexity : O(1)
*/
