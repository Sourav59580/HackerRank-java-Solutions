import java.util.*;
import java.io.*;
import java.lang.Math.*;
class Solution{
public static void main(String []argh){
Scanner in = new Scanner(System.in);
int t=in.nextInt();

for(int i=0;i<t;i++){
int a = in.nextInt();
int b = in.nextInt();
int n = in.nextInt();
int [] s=new int[n];

for(int j=0;j<n;j++)
{
s[j]=a;
for(int k=0;k<=j;k++)
s[j]+=Math.pow(2,k)*b;
System.out.print(s[j]+" ");
}
System.out.println();            
}
in.close();

}
}

