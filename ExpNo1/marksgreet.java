package javaexpno1;
import java.util.Scanner;
public class marksgreet
{
public static void main(String[] args) 
{
		int marks;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the marks from 0 to 10:");
		marks=obj.nextInt();
		switch(marks)
		{
		case 10:
		{
			System.out.println("Excellent");
			break;
		}
		case 9:
		{
			System.out.println("Very good");
			break;
		}
		case 8:
		{
			System.out.println("Very good");
			break;
		}
		case 7:
		{
			System.out.println("Good");
			break;
		}
		case 6:
		{
			System.out.println("Good");
			break;
		}
		case 5:
		{
			System.out.println("Poor");
			break;
		}
		case 4:
		{
			System.out.println("Poor");
			break;
		}
		case 3:
		{
			System.out.println("Poor");
			break;
		}
		case 2:
		{
			System.out.println("Very poor");
			break;
		}
		case 1:
		{
			System.out.println("Very poor");
			break;
		}
		case 0:
		{
			System.out.println("Very poor");
			break;
		}
		default:
		{
			System.out.println("Invalid mark");
			break;
		}
		}

}
}
