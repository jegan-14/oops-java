package expno2;
import java.util.Scanner;
public class emp{
    public static void main(String[] args) {
       Employee obj=new Employee(100,"ABC","XYZ",100000);
       int percent;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter percent:");
       percent=scan.nextInt();
       System.out.println(obj.getID());
       System.out.println(obj.getFirstName());
       System.out.println(obj.getLastName());
       System.out.println(obj.getName());
       System.out.println(obj.getSalary());
       System.out.println(obj.getAnnualSalary());
       System.out.println(obj.raiseSalary(percent));
       System.out.println(obj.toString());
    }
}
class Employee
{
    int id;
    String firstname;
    String lastname;
    int salary;
    Employee(int id1,String fname,String lname,int sal)
    {
     id=id1;
     firstname=fname;
     lastname=lname;
     salary=sal;
    }
    int getID()
    {
       return id;
    }
    String getFirstName()
    {
       return firstname;
    }
    String getLastName()
    {
       return lastname;
    }
    String getName()
    {
        return firstname+' '+lastname;
    }
    int getSalary()
    {
       return salary;
    }
    int getAnnualSalary()
    {
        return salary*12;
    }
    int raiseSalary(int percent)
    {
        salary+=(salary*percent)/100;
        return salary;
    }
    @Override
    public String toString()
    {
     return "id="+id+",name="+firstname+" "+lastname+",salary="+salary;   
    }

}
