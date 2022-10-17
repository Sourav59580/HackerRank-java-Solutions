import java.util.Scanner;  
2.	public class DiamondPattern  
3.	{  
4.	public static void main(String args[])  
5.	{  
6.	int row, i, j, space = 1;  
7.	System.out.print("Enter the number of rows you want to print: ");  
8.	Scanner sc = new Scanner(System.in);  
9.	row = sc.nextInt();  
10.	space = row - 1;  
11.	for (j = 1; j<= row; j++)  
12.	{  
13.	for (i = 1; i<= space; i++)  
14.	{  
15.	System.out.print(" ");  
16.	}  
17.	space--;  
18.	for (i = 1; i <= 2 * j - 1; i++)  
19.	{  
20.	System.out.print("*");  
2g1.	}  
22.	System.out.println("");  
23.	}  
24.	space = 1;  
25.	for (j = 1; j<= row - 1; j++)  
26.	{  
27.	for (i = 1; i<= space; i++)  
28.	{  
29.	System.out.print(" ");  
30.	}  
31.	space++;  
32.	for (i = 1; i<= 2 * (row - j) - 1; i++)  
33.	{  
34.	System.out.print("*");  
35.	}  
36.	System.out.println("");  
37.	}  
38.	}  
39.	}  

