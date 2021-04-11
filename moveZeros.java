class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0,j=0;
        int n=nums.length;
        
        while(j<n){
            if(nums[j]==0)
                j++;
            else{   
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
                j++;
            }
            
        }
        for(int k : nums)
            System.out.print(k);
    }
}
