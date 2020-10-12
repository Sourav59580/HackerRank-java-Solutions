
//Write your code here
class MyRegex
{
    String str="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    /*
    \\d{1,2}   =>catches one or two digit no.
    (0|1)\\d{2}=>catches any three digit no. starting from 0 or 1
    2[0-4]\\d  =>catches no. between 200 & 249
    25[0-5]    =>catches number between 250 & 255
    */
    String pattern=str+"\\."+str+"\\."+str+"\\."+str;
}

