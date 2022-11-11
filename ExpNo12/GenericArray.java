package ExpNo12;
import java.util.ArrayList;
import java.util.Scanner;
public class GenericArray {

		 static ArrayList<Integer> list=new ArrayList<>();
		    public static void main(String[] args) {
		        Scanner scan=new Scanner(System.in);
		        int choice;
		        int val;
		        boolean flag=true;
		        while(flag)
		        {
		            System.out.println("1.Enter element at first\n2.Enter element at middle\n3.Enter element at last\n4.Delete specific index\n5.Display the array\n6.Exit");
		            choice=scan.nextInt();
		            switch(choice)
		            {
		                case 1:
		                    System.out.println("Enter the element:");
		                    val=scan.nextInt();
		                    list.add(0, val);
		                    break;
		                case 2:
		                    System.out.println("Enter the element:");
		                    val=scan.nextInt();
		                    int mid=list.size()/2;
		                    list.add(mid, val);
		                    break;
		                case 3:
		                    System.out.println("Enter the element:");
		                    val=scan.nextInt();
		                    list.add(val);
		                    break;
		                case 4:
		                    System.out.println("Enter the index of element:");
		                    val=scan.nextInt();
		                    list.remove(val+1);
		                    break;
		                case 5:
		                    System.out.println(list);
		                    break;
		                case 6:
		                    flag=false;
		                    break;
		                default:
		                    System.out.println("Wrong operation!!!");
		                    break;
		            }
		        }
	}

}
