class Solution {
    public boolean isPalindrome(String s) {

        String fullWord="";
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch))
                fullWord+=Character.toLowerCase(ch);
        }

        int len=fullWord.length();

        String rev="";

        for(int i=(len-1);i>=0;i--){
            rev+=fullWord.charAt(i);
        }

        if(rev.equals(fullWord))
            return true;

        return false;
    }
}