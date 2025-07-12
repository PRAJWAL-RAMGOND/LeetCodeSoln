int scoreOfString(char* s) {
    int sum=0;
    int len=strlen(s);
    for(int i=1;i<len;++i)
    {
        sum+=abs(s[i]-s[i-1]);
    }
    return sum;
}