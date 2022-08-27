package expno2;
import java.util.Scanner;
public class emp{
    public static void main(String[] args) {
       Employee obj=new Employee(14,"Jeganath","V K",20000);
       int percent,new_salary;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter percent:");
       percent=scan.nextInt();
       System.out.println("Enter salary be to updated:");
       new_salary=scan.nextInt();
       System.out.println("ID:"+obj.getID());
       System.out.println("FIRST NAME:"+obj.getFirstName());
       System.out.println("LAST NAME:"+obj.getLastName());
       System.out.println("NAME:"+obj.getName());
       System.out.println("SALARY:"+obj.getSalary());
       obj.setSalary(new_salary);
       System.out.println("ANNUAL SALARY:"+obj.getAnnualSalary());
       System.out.println("RAISED SALARY:"+obj.raiseSalary(percent));
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
    void setSalary(int salary1)
    {
    	salary=salary1;
    	System.out.println("NEW SALARY:"+salary);
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