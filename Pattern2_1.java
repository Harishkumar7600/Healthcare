package programmingcl;

import java.util.Scanner;

public class Pattern2_1 {
public static void main(String[] args) {
	System.out.println("enter range");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
