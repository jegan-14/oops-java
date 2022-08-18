package javaexpno1;

import java.util.Scanner;
public class daystomonth {
public static void main(String args[])
{
    int days,mon,rem_day;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the days:");
    days=obj.nextInt();
    mon=days/30;
    rem_day=days%30;
    System.out.println(mon+" months "+rem_day+" days");
}
}
