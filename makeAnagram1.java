public static int anagram(String s) {
    if (s.length()%2==1){
        //odd length string 
        return -1;
    }
    int len=s.length();
    String s1=s.substring(0,len/2);
    String s2=s.substring(len/2);
    char [] cnt1 = new char[256];
    char [] cnt2 = new char[256];
    for (int i=0;i<len/2;i++){
        cnt1[s1.charAt(i)]++;
    }
    for (int i=0;i<len/2;i++){
        cnt2[s2.charAt(i)]++;
    }
    int ans=0;
    for (int i=0;i<256;i++){
        if (cnt1[i]>cnt2[i]){
            ans+=(cnt1[i]-cnt2[i]);
        }
    }
    return ans;

}