class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
 Set<Integer> set = new HashSet<>();
        
for(int val : nums1){
    set.add(val);
}
     Set<Integer> Intersection = new HashSet<>();
  for(int val : nums2){
     if(set.contains(val)){
         Intersection.add(val);
     }
    }
      int res[]=new int[Intersection.size()];
        int k=0;
        
        for(int i : Intersection){
            res[k]=i;
            k++;
        }
      
      
      
   
        return res;
    }
}