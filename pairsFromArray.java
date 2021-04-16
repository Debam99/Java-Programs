class Solution {
    public int numIdenticalPairs(int[] nums) {
int c=0;
         HashMap<Integer, Integer> hm= new HashMap<>();
for(int val : nums){
    
    if(hm.containsKey(val)){
        int oldf = hm.get(val);
        int newf=oldf+1;
        hm.put(val,newf);
    }else{
        hm.put(val,1);
    }
}
        
    for(Map.Entry e : hm.entrySet()){
        int freq = (int) e.getValue();
        c+= (freq * (freq - 1)) / 2;
        }
        return c;
    }
}
