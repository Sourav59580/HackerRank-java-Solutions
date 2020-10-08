import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        String a1=A.substring(0,1);
        String b1=B.substring(0,1);
        a1=a1.toUpperCase();
        b1=b1.toUpperCase();
        System.out.println(a1+A.substring(1,A.length())+" "+b1+B.substring(1,B.length()));
        
    }
}
