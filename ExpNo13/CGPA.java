package ExpNo13;


import java.util.*;
class student{
   
    String name;
    int roll_no;
    int cgpa;

    student(String name, int roll_no,int cgpa)

    {
        this.name = name;

        this.roll_no = roll_no;
         this.cgpa = cgpa;

    }
}

class roll_no implements Comparator<student> {

    public int compare(student s1,student s2)

    {
      if(s1.roll_no==s2.roll_no)
          return 0;
      else if(s1.roll_no>s2.roll_no)
          return 1;
      else 
          return -1;
       
    }
   
}

public class CGPA {

    public static void main(String[] args)

    {

        ArrayList<student> s = new ArrayList<>();

        s.add(new student( "a",01,9 ));
        s.add(new student( "b",02,9 ));
        s.add(new student( "c",03,9 ));
        s.add(new student( "d",04,9 ));
        s.add(new student( "e",05,9 ));
        s.add(new student( "f",61,9 ));
        s.add(new student( "g",07,9 ));
        
        s.add(new student( "j",10,9 ));
        s.add(new student( "k",11,9 ));
        s.add(new student( "l",122,9 ));
        s.add(new student( "m",123,9 ));
        s.add(new student( "n",14,9 ));
        s.add(new student( "o",15,9 ));
        s.add(new student( "p",16,9 ));
        s.add(new student( "q",17,9 ));
        s.add(new student( "r",18,9 ));
        s.add(new student( "s",19,9 ));
        s.add(new student( "t",20,9 ));
        s.add(new student( "h",21,9 ));
        s.add(new student( "i",22,9 ));
        
     
        System.out.println("before sorting");

        for (student student : s) {

            System.out.println( student.name

                               + " " + student.roll_no+" "+student.cgpa);

        }

        System.out.println(

            "After sorting(sorted by Roll no.)");

        Collections.sort(s, new roll_no());

        for (student student : s) {

            System.out.println( student.name

                               + " " + student.roll_no+" "+student.cgpa);

        }

    }
}