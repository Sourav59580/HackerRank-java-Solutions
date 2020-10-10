

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) return false;

        a=a.toLowerCase();
        b=b.toLowerCase();
        int fr[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            fr[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            fr[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(fr[i] != 0) return false;
        }
        return true;
    }


