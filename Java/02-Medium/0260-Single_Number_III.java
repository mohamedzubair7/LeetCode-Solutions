class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int[] result=new int[2];
        int k=0;

        for(int i=0;i<n;i++){
            int c=1;
            for(int j=0;j<n;j++){
                if((i!=j) && (nums[i]==nums[j])){
                    c++;
                }
            }

            if(c==1){
                result[k]=nums[i];
                k++;
            }
        }

        return result;
    }
}