class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] chararray = s.toCharArray();
        System.out.println(chararray);
        int pointerR = s.length()-1;
        for (int pointerL = 0; pointerL<=pointerR; pointerL+=1,pointerR-=1){
            if (chararray[pointerL]!=chararray[pointerR]){
                return false;
            }
        }
        return true;
    }
}
