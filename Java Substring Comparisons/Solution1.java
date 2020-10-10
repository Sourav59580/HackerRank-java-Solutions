
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String str="";
        for(int i=0;i<=s.length()-k;i++)
        {
            str += s.substring(i,i+k)+" ";
        }
        //System.out.println(str);
        String s1[]=str.split("\\s");
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s1.length;j++)
            {
                String x=s1[i];
                String y=s1[j];
                int d=y.compareTo(x);
                if(d>0)
                {
                    String temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }
            }
        }
        smallest=s1[0];
        largest=s1[s1.length-1];
        return smallest + "\n" + largest;
    }


