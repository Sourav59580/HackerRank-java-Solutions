import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {



private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
int N = scanner.nextInt();
scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

scanner.close();
String str="";
if( N%2!=0 || N%2==0 && N>=6 && N<=20 )
{
str="Weird";
}
else if(N%2==0 && N>=2 && N<5 || N%2==0 && N>=20)
{
str="Not Weird";
}
System.out.println(str);
}
}

