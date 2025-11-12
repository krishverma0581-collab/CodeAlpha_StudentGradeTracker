import java.util.*;
import java.util.ArrayList;
public class Gradetracker 
{
    private ArrayList<Student> students;
    Scanner in=new Scanner(System.in);
    public Gradetracker()
    {
        students= new ArrayList<>();
    }
    
    public void addstudent(String name)
    {
        students.add(new Student(name));
    }
    
    public Student getstudent(String name)
    {
        for( Student s: students)
        {
            if(s.getName().equalsIgnoreCase(name))  
           {
            return s;
           }
        }
        return null;
    }
    
    
    public void report()
    {
        System.out.println("\n--Student Grade Report--");
        for(Student s:students)
        {
            System.out.println("Name: "+s.getName());
            System.out.println("Average: "+s.getcalc());
            System.out.println("Highest Grade: "+s.gethighestgrade());
            System.out.println("Lowest Grade: "+s.getlowestgrade());
        }
    }
    
    
    public void displaymenu()
    {
        System.out.println("\n--Student Grade Tracker--");
        System.out.println("1: Add Student");
        System.out.println("2: Add garde to student");
        System.out.println("3: Show Student Report");
        System.out.println("4: Show All  Students Summary");
        System.out.println("5: Exit");
        System.out.println(" Enter Choice");
    }
    
    public void userchoice(int choice)
    {
        switch(choice)
        {
            case 1:
                addstudentname();
                break;
                
            case 2:
                addgrade();
                break;
                
            case 3:
            showstudentreport();
            break;
            
            case 4:
            allstudentdata();
            break;
            
            default:
                System.out.println("Invalid Choice");
        }
    }
    
    private void addstudentname()
    {
        System.out.println("Enter the name of the student");
        String name=in.nextLine();
        addstudent(name);
        System.out.println("Student added succesfully");
    }
    
    private void addgrade()
    {
      
        System.out.println("Enter the name of the student");
        String name=in.nextLine();
        Student s=getstudent(name);  
        
        if(s==null)
        {
            System.out.println("Student not found");
            return;
        }
        
        System.out.println("Enter Grades");
        int grade=in.nextInt();
        in.nextLine();
        
        s.addgrade(grade);
        System.out.println("Grade added");
    }
    
    private void showstudentreport()
    {
        System.out.println("Enter student name");
        String name=in.nextLine();
        Student s=getstudent(name);
        
        if(s == null)
        {
            System.out.println("Student not found");
            return;
        }
        
        System.out.println(s.getName()+": report ");
        System.out.println("Average: "+s.getcalc());
        System.out.println("Highest: "+s.gethighestgrade());
        System.out.println("Lowest: "+s.getlowestgrade());
        
    }
    
    private void allstudentdata()
    {
        System.out.println("\n--All Student Summary--");
        for (Student s:students)
        {
            System.out.println("name: "+s.getName()+" Average: "+s.getcalc()+" highest grade: "+s.gethighestgrade()+" lowest grade: "+s.getlowestgrade());
        }
        
    }
}