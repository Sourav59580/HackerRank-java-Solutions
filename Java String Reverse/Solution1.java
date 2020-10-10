import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb=new StringBuilder(A);
        String str=sb.reverse().toString();
        if(A.equals(str))
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
        
    }
}




