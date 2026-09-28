class Solution {
    public char repeatedCharacter(String s) {
        int pv;
        int count=0;
        HashMap<Character,Integer> hm=new HashMap<>();

        for(char ch : s.toCharArray()){
            if(! hm.containsKey(ch)){
                hm.put(ch,1);
            }
            else{           
                pv=hm.get(ch);
                if(pv==1){
                    return ch;
                }
                hm.put(ch,pv+1);
            }
        }

        return ' ';

    }
}