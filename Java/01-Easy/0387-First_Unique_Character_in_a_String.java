class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character,Integer> hm = new HashMap<>();

        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.get(ch)==1)
                return  i;
        }

        return -1;
    }
}