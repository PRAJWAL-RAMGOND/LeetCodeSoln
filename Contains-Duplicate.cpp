class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> temp(nums.begin(),nums.end());
        //size_t sizeofset = set.size();
        if(nums.size() == temp.size())
        {
            return false;
        }
        return true;
    }
};