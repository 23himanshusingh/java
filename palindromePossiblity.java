public static String gameOfThrones(String s) {
    char []cnt=new char[256];
    for(int i=0;i<s.length();i++){
        cnt[s.charAt(i)]++;
    }
    int count=0;
    for (int i=0;i<256;i++){
        if (cnt[i]%2 != 0){
            count++;
        }
    }
    if (s.length()%2 == 0){
        if (count==0){
            return "YES";
        }
        else{
            return "NO";
        }
    }
    if (count==1){
        return "YES";
    }
    else{
        return "NO";
    }

}


