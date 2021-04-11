class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l=0;
        
        int n=numbers.length;
        int r=n-1;
        while(l<n){
            int sum=numbers[l]+numbers[r];
            if(sum==target){
                return new int[]{l+1, r+1};
            }
            if(sum>=target)
             r--;
            if(sum<=target)
                l++;
                
            }
                
               return new int[]{l+1,r+1};

    }
}
