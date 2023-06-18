public static int makingAnagrams(String s1, String s2) {
        
    char [] cnt1 = new char[256];
    char [] cnt2 = new char[256];
    for (int i=0;i<s1.length();i++){
        cnt1[s1.charAt(i)]++;
    }
    for (int i=0;i<s2.length();i++){
        cnt2[s2.charAt(i)]++;
    }int ans=0;
    for (int i=0;i<256;i++){
        ans+=Math.abs(cnt1[i]-cnt2[i]);
    }
    return ans;

}