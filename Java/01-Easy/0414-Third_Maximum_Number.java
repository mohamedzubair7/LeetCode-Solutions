class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> ts=new TreeSet<>();

        for(int i:nums)
            ts.add(i);

        if(ts.size()>2){
            for(int i=0;i<=1;i++){
                ts.remove(ts.last());
            }
        }

        return ts.last();
    }
}