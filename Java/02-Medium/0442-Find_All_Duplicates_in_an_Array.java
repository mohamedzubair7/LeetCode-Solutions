class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int pv;
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i:nums){
            if(! hm.containsKey(i)){
                hm.put(i,1);
            }
            else{
                pv=hm.get(i);
                hm.put(i,pv+1);
            }
        }

        for(int i:hm.keySet()){
            if(hm.get(i)>1){
                result.add(i);
            }
        }

        return result;

    }
}