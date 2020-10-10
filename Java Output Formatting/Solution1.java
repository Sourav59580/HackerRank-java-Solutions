import java.util.Scanner;

public class Solution1 {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("================================");
for(int i=0;i<3;i++){
String s1=sc.next();
int x=sc.nextInt();
String str,s="";
int count=0;
while(count< (15-s1.length()))
{
s+=" ";
count++;
}
if(x<100)
{
if(x<10)
str=s+"00"+x;
else
str=s+"0"+x;
}
else
str=s+x;
System.out.println(s1+str);
}
System.out.println("================================");

}
}




