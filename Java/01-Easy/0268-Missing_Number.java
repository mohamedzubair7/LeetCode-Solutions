class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sumArray=0;
        for(int i:nums){
            sumArray+=i;
        }
        
        return sum-sumArray;
    }
}