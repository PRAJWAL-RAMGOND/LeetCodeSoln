class Solution {
    public int lengthOfLastWord(String s) {
        String[] temp=s.split(" ");
        String last = temp[temp.length-1];
        //System.out.println(last);
        return last.length();
    }
}