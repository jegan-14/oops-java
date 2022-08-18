package javaexpno1;
import java.util.Scanner;
public class sum_pro {
    public static void main(String args[])
    {
        int a,sum=0,pro=1,i,temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the digit:");
        a=obj.nextInt();
        temp=a;
        while(temp>0)
        {
            i=temp%10;
            sum+=i;
            pro*=i;
            temp=temp/10;
        }
        System.out.println("Sum is "+sum);
        System.out.println("product is "+pro);
                
                
    }
}
