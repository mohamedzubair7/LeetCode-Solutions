class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        int pv;

        for(int i:nums){
            if(! hm.containsKey(i)){
                hm.put(i,1);
            }
            else{
                pv=hm.get(i);
                hm.put(i,pv+1);
            }
        }

        List<Integer> res=new ArrayList<>();

        for(int i:hm.keySet()){
            if(hm.get(i)>(nums.length/3)){
                res.add(i);
            }
        }
        return res;
    }
}