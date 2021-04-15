class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm= new HashMap<>();
for(int val : nums1){
    if(hm.containsKey(val)){
        int oldf = hm.get(val);
        int newf=oldf+1;
        hm.put(val,newf);
    }else{
        hm.put(val,1);
    }
}
        
List<Integer> list = new ArrayList();        
        for(int val : nums2){
        if(hm.containsKey(val) && hm.get(val)>0){
            list.add(val);
            int oldf = hm.get(val);
            int newf=oldf-1;
            hm.put(val,newf);
         
        }
        }
        
        int res[]=new int[list.size()];
        int k=0;
         
        for(int i : list){
            res[k++]=i;
        }
        
        return res;
        
    }
}
