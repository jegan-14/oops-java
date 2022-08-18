package javaexpno1;
import java.util.Scanner;
public class starpattern
{
public static void main(String args[])
{
	int i,j,n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no of rows:");
	n=obj.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=2*(n-i);j>=0;j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
