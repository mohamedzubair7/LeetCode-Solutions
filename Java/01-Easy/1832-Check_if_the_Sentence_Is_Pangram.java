class Solution {
    public boolean checkIfPangram(String sentence) {

        int count=0;
        for(int i=97;i<=122;i++){
            if(sentence.contains(Character.toString((char) i)))
                count++;
        }

        if(count==26)
            return true;
        
        return false;
        
    }
}