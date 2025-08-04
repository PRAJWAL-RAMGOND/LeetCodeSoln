class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,t=x;
        while(x>0)
        {
            int digi=x%10;
            x=x/10;
            rev=rev*10+digi;
        }
        return(rev==t);
    }
}