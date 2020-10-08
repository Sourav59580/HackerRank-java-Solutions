import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution1 {
static Scanner sc=new Scanner(System.in);
static int H=sc.nextInt();
static int B=sc.nextInt();
static boolean flag=false;
static String s="java.lang.Exception: Breadth and height must be positive";
static {
    if(H<=0||B<=0)
    {
        System.out.println(s);
        flag=false;
    }
    else 
    flag=true;
}

public static void main(String[] args){
    if(flag){
        int area=B*H;
        System.out.print(area);
    }
    
}

}
