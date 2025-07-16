class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
        return false;
        long int rev=0,og;
        og=x;
        while(x!=0)
        {
            rev=(rev*10) + x % 10;
            x/=10;
        }
        return og==rev;
    }
};