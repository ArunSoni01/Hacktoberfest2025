class Solution {
    public void sortColors(int[] nums) {
        int count0s=0, count1s=0, count2s=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                count0s++;
            else if(nums[i]==1)
                count1s++;
            else if(nums[i]==2)
                count2s++;
        }
        int count=0;
        for(int i=0; i<count0s; i++){
            nums[count++]=0;
        }
        for(int i=0; i<count1s; i++){
            nums[count++]=1;
        }
        for(int i=0; i<count2s; i++){
            nums[count++]=2;
        }

    }
}
